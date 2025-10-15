package com.example.fakestoreecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
