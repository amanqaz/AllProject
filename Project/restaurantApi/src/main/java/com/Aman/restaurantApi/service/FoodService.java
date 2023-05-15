package com.Aman.restaurantApi.service;

import com.Aman.restaurantApi.DTO.FoodAddeder;
import com.Aman.restaurantApi.model.ENUMS.Quantity;
import com.Aman.restaurantApi.model.Food;
import com.Aman.restaurantApi.model.Restaurant;
import com.Aman.restaurantApi.repositatory.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    IFoodRepo foodRepo;

    @Autowired
    RestaurantService restaurantService;


    public void addFood(FoodAddeder food) {




        Restaurant restaurant = restaurantService.getRestaurantById(food.getRestaurantId ());

        Quantity qan = Quantity.valueOf ( ) ;

        if(restaurant !=null)  foodRepo.save ( new Food ( food.getName (),qan,restaurant ) );





    }
}
