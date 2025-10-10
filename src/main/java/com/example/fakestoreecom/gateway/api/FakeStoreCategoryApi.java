package com.example.fakestoreecom.gateway.api;

import com.example.fakestoreecom.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreCategoryApi {
    @GET("categories")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories();
}
