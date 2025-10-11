package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.dto.FakeStoreCategoryResponseDTO;
import com.example.fakestoreecom.dto.FakeStoreSingleCategoryDTO;
import com.example.fakestoreecom.mappers.GetAllCategoryDTOMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Component("fakeStoreRestTemplateCategoryGateway")
public class FakeStoreRestTemplateCategoryGateway implements ICategoryGateway {
    @Value("${FakeStoreURI}")
    String URI;

    RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTemplateCategoryGateway(RestTemplateBuilder _restTemplateBuilder) {
        this.restTemplateBuilder = _restTemplateBuilder;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreCategoryResponseDTO response = restTemplate.getForObject(URI + "categories", FakeStoreCategoryResponseDTO.class);
        if(response == null){
            throw new IOException("Error while fetching categories");
        }

        List<CategoryDTO> categoryDTOList = GetAllCategoryDTOMapper.getCategoryDTOList(response);
        return categoryDTOList;
    }
}
