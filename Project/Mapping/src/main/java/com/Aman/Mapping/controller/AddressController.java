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

    @GetMapping("/getAddressById/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @DeleteMapping("deleteAddress/{id}")
    public void deleteAddressById(@PathVariable Long id){
        addressService.deleteAddressById(id);
    }
    @PutMapping("updateAddress/{id}")
    public void updateAddress(@RequestBody Address address, @PathVariable Long id){
        addressService.updateAddressById(address,id);
    }

}