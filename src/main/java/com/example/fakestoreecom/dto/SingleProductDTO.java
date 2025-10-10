package com.example.fakestoreecom.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SingleProductDTO {
    private int _id;
    private String title;
    private boolean isNew;
    private String oldPrice;
    private int newPrice;
    private double discountedPrice;
    private String description;
    private String category;
    private String type;
    private int stock;
    private String brand;
    private String[] size;
    private String image;
    private int rating;
}
