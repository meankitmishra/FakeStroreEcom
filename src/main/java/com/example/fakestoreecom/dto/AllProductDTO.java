package com.example.fakestoreecom.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllProductDTO {
    List<SingleProductDTO> data;
    private int totalProducts;
}
