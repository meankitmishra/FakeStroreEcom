package com.example.fakestoreecom.repository;

import com.example.fakestoreecom.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p from Product p WHERE p.newPrice > :minPrice")
    List<Product> findExpensiveProduct(@Param("minPrice") int minPrice);
}