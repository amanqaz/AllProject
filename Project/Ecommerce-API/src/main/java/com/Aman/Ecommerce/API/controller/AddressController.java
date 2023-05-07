package com.Aman.Ecommerce.API.controller;

import com.Aman.Ecommerce.API.model.Address;
import com.Aman.Ecommerce.API.model.User;
import com.Aman.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService service;
    @PostMapping("/")
    public void addAddress(@RequestBody Address address){
        service.addAddress(address);

    }

}
