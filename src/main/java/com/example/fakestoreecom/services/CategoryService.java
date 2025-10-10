package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service

public class CategoryService implements ICategoryService {

    private ICategoryGateway categoryGateway;

    public CategoryService(@Qualifier("fakeStoreRestTemplateCategoryGateway") ICategoryGateway _categoryGateway) {
        this.categoryGateway = _categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryGateway.getAllCategories();
    }

}
