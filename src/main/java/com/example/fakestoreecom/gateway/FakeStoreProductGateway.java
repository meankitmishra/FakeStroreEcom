package com.example.fakestoreecom.gateway;

import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.exceptions.ProductNotFoundException;
import com.example.fakestoreecom.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreProductGateway(FakeStoreProductApi _fakeStoreProductApi) {
        this.fakeStoreProductApi = _fakeStoreProductApi;
    }

    @Override
    public AllProductDTO getAllProducts() throws IOException  {
        AllProductDTO response = this.fakeStoreProductApi.getAllFakeProducts().execute().body();
        if(response == null){
            throw new ProductNotFoundException("Error getting all products");
        }
        System.out.println("getAllProducts from gateway");
        return response;

    }
}
