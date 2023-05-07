package com.Aman.Ecommerce.API.controller;

import com.Aman.Ecommerce.API.model.Orders;
import com.Aman.Ecommerce.API.service.OrderService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OderController {
    @Autowired OrderService service;

//    @GetMapping("get/{userId}/{addressId}/{productId}/{quantity}")
//    public void placeOrder(@PathVariable Integer userId, @PathVariable Integer addressId,@PathVariable  Integer productID ,@PathVariable Integer quantity){
//        service.placeOrder(userId,addressId,productID,quantity);
//    }

    @PostMapping("placeOrder")
    public void placingOrder(@RequestBody Orders order){
        service.placingOrder(order);

    }



}
