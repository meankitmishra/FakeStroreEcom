package com.example.fakestoreecom.services;


import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;

import java.io.IOException;

public interface IProductService {
    public AllProductDTO getAllProducts() throws IOException;

    public SingleProductDTO getSingleProduct(int id) throws IOException;
}
