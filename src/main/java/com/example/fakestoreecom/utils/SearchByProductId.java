package com.example.fakestoreecom.utils;

import com.example.fakestoreecom.dto.SingleProductDTO;

import java.util.*;


public class SearchByProductId {
    public static int searchProductById(List<SingleProductDTO> allProducts , long productId){
        int left = 0;
        int right = allProducts.size();
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(allProducts.get(mid).get_id() == productId){
                return mid;
            }else if(allProducts.get(mid).get_id() < productId) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
