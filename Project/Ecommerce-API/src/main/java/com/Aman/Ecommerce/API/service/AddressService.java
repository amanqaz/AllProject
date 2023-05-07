package com.Aman.Ecommerce.API.service;

import com.Aman.Ecommerce.API.model.Address;
import com.Aman.Ecommerce.API.model.User;
import com.Aman.Ecommerce.API.repositatory.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressDatabase;
    public void addAddress(Address address) {
        addressDatabase.save( address );

    }
}
