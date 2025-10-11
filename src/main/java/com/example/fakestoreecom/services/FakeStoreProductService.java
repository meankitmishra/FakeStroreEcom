package com.example.fakestoreecom.services;


import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.gateway.IProductGateway;
import com.example.fakestoreecom.utils.SearchByProductId;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {
    private IProductGateway iProductGateway;

    public FakeStoreProductService(IProductGateway _iProductGateway) {
        this.iProductGateway = _iProductGateway;
    }

    @Override
    public AllProductDTO getAllProducts() throws IOException {
        System.out.println("getAllProducts from service");
        return this.iProductGateway.getAllProducts();
    }

    @Override
    public SingleProductDTO getSingleProduct(Long id) throws IOException{
        AllProductDTO allproductsResponse = this.iProductGateway.getAllProducts();
        if(allproductsResponse == null) {
            throw new IOException("getSingleProduct: product not found");
        }
        List<SingleProductDTO> allProducts = allproductsResponse.getData();
        if(allProducts == null) {
            throw new IOException("getSingleProduct: product not found");
        }
        allProducts.sort(Comparator.comparingLong(SingleProductDTO::get_id));
        int index = SearchByProductId.searchProductById(allProducts, id);
        if(index < 0) {
            throw new IOException("getSingleProduct: product not found");
        }else{
            return allProducts.get(index);
        }
    }

    @Override
    public SingleProductDTO createProduct(SingleProductDTO dto){
        return null;
    }

}
