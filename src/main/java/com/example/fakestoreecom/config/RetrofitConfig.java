package com.example.fakestoreecom.config;

import com.example.fakestoreecom.gateway.api.FakeStoreCategoryApi;
import com.example.fakestoreecom.gateway.api.FakeStoreProductApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;




@Configuration
public class RetrofitConfig {
    @Value("${com.example.fakestoreecom.config.URI}")
    String URI;
    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(URI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return retrofit.create(FakeStoreProductApi.class);
    }
}
