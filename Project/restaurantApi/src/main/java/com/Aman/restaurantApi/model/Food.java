package com.Aman.restaurantApi.model;


import com.Aman.restaurantApi.model.ENUMS.Quantity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long FoodId;



    private String name;

    public Food(String name, Quantity quantity, @NonNull Restaurant restaurant) {
        this.name = name;
        this.quantity = quantity;
        this.restaurant = restaurant;
    }

    @Enumerated(EnumType.STRING)
    @Embedded

    private Quantity quantity;


    @ManyToOne(cascade = CascadeType.ALL)
    @NonNull
    private Restaurant restaurant;


}
