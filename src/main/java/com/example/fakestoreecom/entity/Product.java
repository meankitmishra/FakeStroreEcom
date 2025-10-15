package com.example.fakestoreecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String type;
    private int stock;
    private String brand;
    private String[] size;
    private String image;
    private int rating;

    @JoinColumn(name = "categoryId",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
}
