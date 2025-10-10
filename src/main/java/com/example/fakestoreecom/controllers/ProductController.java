package com.example.fakestoreecom.controllers;

import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private IProductService iProductService;

    public ProductController(IProductService _iProductService){
        this.iProductService = _iProductService;
    }


    @GetMapping
    public AllProductDTO getAllProducts() throws IOException{
        return this.iProductService.getAllProducts();
    }

    @GetMapping("/{id}")
    public SingleProductDTO getProductById(@PathVariable int id) throws IOException{
        return this.iProductService.getSingleProduct(id);
    }
}
