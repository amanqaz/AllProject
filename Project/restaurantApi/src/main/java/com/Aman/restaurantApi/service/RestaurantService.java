package com.Aman.restaurantApi.service;

import com.Aman.restaurantApi.model.Restaurant;
import com.Aman.restaurantApi.repositatory.IRestaurantRepo;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    IRestaurantRepo restaurantRepo;

    public void addRestaurant(Restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }

    public Restaurant getRestaurantById(Long restaurantId) {
        if(restaurantRepo.findById ( restaurantId ).get()==null) throw new IllegalArgumentException ( "Restaurant Not exist or Closed " ) ;
        return  restaurantRepo.findById ( restaurantId ).get();

    }
}
