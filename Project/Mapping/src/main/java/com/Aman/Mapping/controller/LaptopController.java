package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Laptop;
import com.Aman.Mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("student/{id}")
    public void addLaptop(@RequestBody  Laptop laptop, @PathVariable Long id){

    }
}
