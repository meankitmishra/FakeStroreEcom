package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.entity.Category;
import com.example.fakestoreecom.exceptions.CategoryNotFoundException;
import com.example.fakestoreecom.mappers.CategoryMapper;
import com.example.fakestoreecom.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository _categoryRepository) {
        this.categoryRepository = _categoryRepository;
    }


    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();
        if(categoryList.isEmpty()){
            throw new CategoryNotFoundException("Category List is Empty");
        }
        return CategoryMapper.toCategoryDTOList(categoryList);
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto) throws IOException {
        Category categorySaved = categoryRepository.save(CategoryMapper.toCategory(dto));
        return CategoryMapper.toCategoryDTO(categorySaved);
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        Category category = categoryRepository.findByCategoryName(name)
                .orElseThrow(() -> new CategoryNotFoundException("Category Not Found"));
        return CategoryMapper.toCategoryDTO(category);
    }
}
