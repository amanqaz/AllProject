package com.Aman.restaurantApi.repositatory;

import com.Aman.restaurantApi.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepo extends JpaRepository<Restaurant,Long> {
}
