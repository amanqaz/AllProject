package com.Aman.restaurantApi.model;

import com.Aman.restaurantApi.model.ENUMS.Specialility;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;
    private  String restaurantName;
    private String restaurantManager;
    private Integer restaurantTotalEmp;

    @Enumerated(EnumType.STRING)
    private Specialility specialility; // list od enum


    @OneToMany(mappedBy = "restaurant")
    private List<Food> foods;


}
