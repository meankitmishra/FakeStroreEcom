package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.dto.FakeStoreCategoryResponseDTO;
import com.example.fakestoreecom.dto.FakeStoreSingleCategoryDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Component("fakeStoreRestTemplateCategoryGateway")
public class FakeStoreRestTemplateCategoryGateway implements ICategoryGateway {
    @Value("${FakeStoreURI}")
    String URI;

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(URI);
        FakeStoreCategoryResponseDTO response = restTemplate.getForObject(URI + "categories", FakeStoreCategoryResponseDTO.class);
        if(response == null){
            throw new IOException("Error while fetching categories");
        }
        List <FakeStoreSingleCategoryDTO> productResponse = response.getData();
        List<String> listOfCategory = new ArrayList<>();
        productResponse.forEach(product->{
            listOfCategory.add(product.getName());
        });

        List<CategoryDTO> categoryDTOList = listOfCategory.stream()
                .map(category -> CategoryDTO.builder()
                        .categoryName(category)
                        .build())
                .toList();

        return categoryDTOList;
    }
}
