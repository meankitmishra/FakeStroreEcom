package com.example.fakestoreecom.services;


import com.example.fakestoreecom.dto.AllProductDTO;
import com.example.fakestoreecom.dto.ProductWithCategoryDTO;
import com.example.fakestoreecom.dto.SingleProductDTO;
import com.example.fakestoreecom.exceptions.ProductNotFoundException;
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
    public AllProductDTO getAllProducts()  {
//        System.out.println("getAllProducts from service");
//        return this.iProductGateway.getAllProducts();
        return null;
    }

    @Override
    public SingleProductDTO getSingleProduct(Long id) {
//        AllProductDTO allproductsResponse = this.iProductGateway.getAllProducts();
//        if(allproductsResponse == null) {
//            throw new ProductNotFoundException("getSingleProduct: product not found");
//        }
//        List<SingleProductDTO> allProducts = allproductsResponse.getData();
//        if(allProducts == null) {
//            throw new ProductNotFoundException("getSingleProduct: product not found");
//        }
//        allProducts.sort(Comparator.comparingLong(SingleProductDTO::get_id));
//        int index = SearchByProductId.searchProductById(allProducts, id);
//        if(index < 0) {
//            throw new ProductNotFoundException("getSingleProduct: product not found");
//        }else{
//            return allProducts.get(index);
//        }
        return null;
    }

    @Override
    public SingleProductDTO createProduct(SingleProductDTO dto){
        return null;
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id)  {
        //Not Implemented
        return null;
    }

}
