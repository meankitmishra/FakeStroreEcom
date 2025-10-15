package com.example.fakestoreecom.controllers;

import com.example.fakestoreecom.dto.CategoryDTO;
import com.example.fakestoreecom.services.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryService iCategoryService;

    public CategoryController(@Qualifier("categoryService") ICategoryService _iCategoryService) {
        this.iCategoryService = _iCategoryService;
    }

    @GetMapping
    public ResponseEntity<?> geAllCategories(@RequestParam(required = false) String categoryName ) throws Exception {
        if(categoryName != null && !categoryName.isBlank()){
            CategoryDTO categoryDTO = this.iCategoryService.getCategoryByName(categoryName);
            if(categoryDTO == null){
                throw new Exception("Category name not found");
            }
            return ResponseEntity.ok(categoryDTO);
        }else{
            List<CategoryDTO> categoryDTOs = this.iCategoryService.getAllCategories();
            return ResponseEntity.ok(categoryDTOs);
        }
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(CategoryDTO dto) throws IOException {
        CategoryDTO result = this.iCategoryService.createCategory(dto);
        return ResponseEntity.ok(result);
    }



}
