package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.AllProductDTO;

import java.io.IOException;

public interface IProductGateway {
    public AllProductDTO getAllProducts() throws IOException;
}
