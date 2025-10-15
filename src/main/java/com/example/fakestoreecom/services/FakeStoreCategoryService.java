package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service

public class FakeStoreCategoryService implements ICategoryService {

    private ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(@Qualifier("fakeStoreRestTemplateCategoryGateway") ICategoryGateway _categoryGateway) {
        this.categoryGateway = _categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto) throws IOException {
        return null;
    }

    @Override
    public CategoryDTO getCategoryByName(String name) throws IOException {
        return null;
    }

}
