package com.example.fakestoreecom.mappers;

import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.entity.Product;

public class SingleProductMapper {
    public static SingleProductDTO toDTO(Product product){
        return SingleProductDTO.builder()
                ._id(product.getId())
                .title(product.getTitle())
                .isNew(product.isNew())
                .oldPrice(product.getOldPrice())
                .newPrice(product.getNewPrice())
                .discountedPrice(product.getDiscountedPrice())
                .description(product.getDescription())
                .category(product.getCategory())
                .type(product.getType())
                .stock(product.getStock())
                .brand(product.getBrand())
                .size(product.getSize())
                .image(product.getImage())
                .rating(product.getRating())
                .build();
    }

    public static Product toEntity(SingleProductDTO singleProductDTO){
        return Product.builder()
                .title(singleProductDTO.getTitle())
                .isNew(singleProductDTO.isNew())
                .oldPrice(singleProductDTO.getOldPrice())
                .newPrice(singleProductDTO.getNewPrice())
                .discountedPrice(singleProductDTO.getDiscountedPrice())
                .description(singleProductDTO.getDescription())
                .category(singleProductDTO.getCategory())
                .type(singleProductDTO.getType())
                .stock(singleProductDTO.getStock())
                .brand(singleProductDTO.getBrand())
                .size(singleProductDTO.getSize())
                .image(singleProductDTO.getImage())
                .rating(singleProductDTO.getRating())
                .build();
    }
}


