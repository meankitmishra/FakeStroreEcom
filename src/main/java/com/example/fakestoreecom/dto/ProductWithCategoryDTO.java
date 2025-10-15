package com.example.fakestoreecom.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWithCategoryDTO {
    private long _id;
    private String title;
    private boolean isNew;
    private String oldPrice;
    private int newPrice;
    private double discountedPrice;
    private String description;
    private String type;
    private int stock;
    private String brand;
    private String[] size;
    private String image;
    private int rating;
    private CategoryDTO category;
}

