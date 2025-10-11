package com.example.fakestoreecom.controllers;

import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.services.IProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private IProductService iProductService;

    public ProductController(@Qualifier("productService") IProductService _iProductService){
        this.iProductService = _iProductService;
    }


    @GetMapping
    public AllProductDTO getAllProducts() throws IOException{
        return this.iProductService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SingleProductDTO> getProductById(@PathVariable Long id) throws IOException{
        SingleProductDTO result = this.iProductService.getSingleProduct(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<SingleProductDTO> createProduct(@RequestBody SingleProductDTO productDTO) throws IOException{
        SingleProductDTO result = this.iProductService.createProduct(productDTO);
        return ResponseEntity.ok(result);
    }
}
