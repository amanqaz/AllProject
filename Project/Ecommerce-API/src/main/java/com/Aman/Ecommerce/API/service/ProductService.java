package com.Aman.Ecommerce.API.service;

import com.Aman.Ecommerce.API.model.Product;
import com.Aman.Ecommerce.API.repositatory.IProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductsRepo productDatabase;
    public void addProduct(Product product) {
        productDatabase.save ( product );

    }
}
