package com.example.fakestoreecom.gateway.api;

import com.example.fakestoreecom.dto.AllProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreProductApi {
    @GET("products")
    Call<AllProductDTO> getAllFakeProducts();
}
