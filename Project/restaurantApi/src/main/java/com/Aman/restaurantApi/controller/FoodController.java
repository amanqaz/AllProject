package com.Aman.restaurantApi.controller;

import com.Aman.restaurantApi.DTO.FoodAddeder;
import com.Aman.restaurantApi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")

public class FoodController {
    @Autowired
    FoodService foodService;
    @PostMapping()
    public void addFood(@RequestBody FoodAddeder food){
        foodService.addFood(food);

    }


}
