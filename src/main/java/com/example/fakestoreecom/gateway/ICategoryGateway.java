package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;


public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
