package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.ProductWithCategoryDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.entity.Category;
import com.example.fakestoreecom.entity.Product;
import com.example.fakestoreecom.exceptions.CategoryNotFoundException;
import com.example.fakestoreecom.exceptions.ProductNotFoundException;
import com.example.fakestoreecom.mappers.SingleProductMapper;
import com.example.fakestoreecom.repository.CategoryRepository;
import com.example.fakestoreecom.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public ProductService(ProductRepository _productRepository,  CategoryRepository _categoryRepository) {
        this.productRepository = _productRepository;
        this.categoryRepository = _categoryRepository;
    }

    @Override
    public AllProductDTO getAllProducts() {
        return null;
    }

    @Override
    public SingleProductDTO getSingleProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));

        return SingleProductMapper.toDTO(product);
    }

    @Override
    public SingleProductDTO createProduct(SingleProductDTO dto) {
        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new CategoryNotFoundException("Cannot create product of unknown category"));

        Product savedProduct = productRepository.save(SingleProductMapper.toEntity(dto, category));
        return SingleProductMapper.toDTO(savedProduct);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
        return SingleProductMapper.toProductWithCategoryDTO(product);
    }

}
