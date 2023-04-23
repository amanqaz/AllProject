package com.Aman.Resturent.Controller;

import com.Aman.Resturent.Model.Restaurant;
import com.Aman.Resturent.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@Repository
public class Resturent_Controller {


    @Autowired
    Services service;

    @GetMapping(value = "/getById/{id}")

    public Restaurant getById(@PathVariable String id){
        return  service.getById(id);
    }

    @PostMapping (value = "/addRestaurant")

    public String addRestaurant(@RequestBody Restaurant newEntry){

        return  service.addUser(newEntry);

    }

    @GetMapping("/getAllRestaurant")
    public List<Restaurant> getAll(){
        return service.getAll();
    }

    @PutMapping("/SpecialityChange/{data}/{id}")
    public String updateSpecial(@PathVariable String data,@PathVariable String id){
        return service.upadateSpeciality(data,id);

    }

    @DeleteMapping("/deleteUserId/{id}")

    public String deleteuser(@PathVariable String id){
        return service.deleteUser(id);
    }





}
