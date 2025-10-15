package com.example.fakestoreecom.mappers;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {
    public static CategoryDTO toCategoryDTO(Category category){
        return CategoryDTO.builder()
                .id(category.getId())
                .categoryName(category.getCategoryName())
                .build();
    }

    public static Category toCategory(CategoryDTO categoryDTO){
        return Category.builder()
                .categoryName(categoryDTO.getCategoryName())
                .build();
    }

    public static List<CategoryDTO> toCategoryDTOList(List<Category> categoryList){
        return categoryList.stream()
                .map(CategoryMapper::toCategoryDTO)
            .toList();
    }
}
