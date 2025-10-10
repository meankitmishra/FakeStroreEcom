package com.example.fakestoreecom.controllers;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryService iCategoryService;

    public CategoryController(ICategoryService _iCategoryService) {
        this.iCategoryService = _iCategoryService;
    }

    @GetMapping
    public List<CategoryDTO> geAllCategories() throws IOException {
        return this.iCategoryService.getAllCategories();
    }


}
