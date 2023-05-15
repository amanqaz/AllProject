package com.Aman.restaurantApi.DTO;

import com.Aman.restaurantApi.model.Food;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FoodAddeder extends Food {
    @NotNull
    private Long restaurantId;
    private String foodQuantity;
}
