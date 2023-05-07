package com.Aman.Ecommerce.API.service;

import com.Aman.Ecommerce.API.model.User;
import com.Aman.Ecommerce.API.repositatory.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userDatabase;
    public void addUser(User user) {
        userDatabase.save ( user );
    }
}
