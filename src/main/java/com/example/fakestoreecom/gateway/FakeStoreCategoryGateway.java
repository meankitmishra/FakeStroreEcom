package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.dto.FakeStoreCategoryResponseDTO;
import com.example.fakestoreecom.dto.FakeStoreSingleCategoryDTO;
import com.example.fakestoreecom.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi _fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = _fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response == null){
            throw new IOException("Error while fetching categories");
        }
        List <FakeStoreSingleCategoryDTO> productResponse = response.getData();
        if(productResponse == null){
            throw new IOException("Error while fetching categories");
        }
        List<String> listOfCategory = new ArrayList<>();
        productResponse.forEach(product->{
            listOfCategory.add(product.getName());
        });

        return listOfCategory.stream()
                .map(category -> CategoryDTO.builder()
                        .categoryName(category)
                        .build())
                .toList();
    }
}
