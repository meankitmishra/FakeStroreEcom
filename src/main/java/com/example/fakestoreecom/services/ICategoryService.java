package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;


public interface ICategoryService {

    public List<CategoryDTO> getAllCategories() throws IOException;

    public CategoryDTO createCategory(CategoryDTO dto) throws IOException;

    CategoryDTO getCategoryByName(String name) throws Exception;
}
