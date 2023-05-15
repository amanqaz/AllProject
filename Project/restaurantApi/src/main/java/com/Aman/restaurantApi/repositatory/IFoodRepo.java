package com.Aman.restaurantApi.repositatory;

import com.Aman.restaurantApi.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<Food,Long> {
}
