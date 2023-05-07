package com.Aman.Ecommerce.API.controller;

import com.Aman.Ecommerce.API.model.Product;
import com.Aman.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService service;
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
}
