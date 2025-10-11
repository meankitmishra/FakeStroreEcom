package com.example.fakestoreecom.services;

import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.entity.Product;
import com.example.fakestoreecom.mappers.SingleProductMapper;
import com.example.fakestoreecom.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository _productRepository) {
        this.productRepository = _productRepository;
    }

    @Override
    public AllProductDTO getAllProducts() throws IOException{
        return null;
    }

    @Override
    public SingleProductDTO getSingleProduct(Long id) throws IOException{
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IOException("Product not found"));

        return SingleProductMapper.toDTO(product);
    }

    @Override
    public SingleProductDTO createProduct(SingleProductDTO dto) throws IOException{
        Product savedProduct = productRepository.save(SingleProductMapper.toEntity(dto));
        return SingleProductMapper.toDTO(savedProduct);
    }
}
