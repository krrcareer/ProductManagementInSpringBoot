package com.krr.ProductManagementUsingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductDB productDB;

    public List<Product> getAllProducts(){
        //return products;
        return productDB.findAll();
    }

}
