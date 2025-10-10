package com.example.fakestoreecom.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class FakeStoreSingleCategoryDTO {
    private Integer _id;
    private String name;
    private String description;
    private Integer parentId;
}
