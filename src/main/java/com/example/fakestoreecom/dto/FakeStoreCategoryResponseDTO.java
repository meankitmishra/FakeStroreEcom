package com.example.fakestoreecom.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class FakeStoreCategoryResponseDTO {
    private List<FakeStoreSingleCategoryDTO> data;
    private Integer totalCategories;
}
