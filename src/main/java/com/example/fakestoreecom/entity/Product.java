package com.example.fakestoreecom.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity{
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
