package com.example.fakestoreecom.services;


import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.ProductWithCategoryDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;

import java.io.IOException;

public interface IProductService {
    public AllProductDTO getAllProducts() ;

    public SingleProductDTO getSingleProduct(Long id);

    public SingleProductDTO createProduct(SingleProductDTO dto);

    public ProductWithCategoryDTO getProductWithCategory(Long id) ;
}
