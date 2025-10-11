package com.example.fakestoreecom.mappers;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.dto.FakeStoreCategoryResponseDTO;
import com.example.fakestoreecom.dto.FakeStoreSingleCategoryDTO;

import java.util.*;

public class GetAllCategoryDTOMapper {
    public static List <CategoryDTO> getCategoryDTOList(FakeStoreCategoryResponseDTO response){
        List <FakeStoreSingleCategoryDTO> categoryResponse = response.getData();
        List<String> stringListOfCategory =  new ArrayList<>();
        categoryResponse.forEach(category -> stringListOfCategory.add(category.getName()));
        List<CategoryDTO> categoryDTOList = stringListOfCategory.
                stream()
                .map(category -> CategoryDTO.builder()
                        .categoryName(category)
                        .build())
                .toList();
        return categoryDTOList;
    }
}
