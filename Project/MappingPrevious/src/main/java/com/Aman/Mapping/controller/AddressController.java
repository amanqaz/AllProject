package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Address;
import com.Aman.Mapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("studentId/{id}")
    public void addAddress(@RequestBody  Address address, @PathVariable Long id){
        addressService.insertAddress(address,id);
    }
}
