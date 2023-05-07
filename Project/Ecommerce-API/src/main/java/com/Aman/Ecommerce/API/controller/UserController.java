package com.Aman.Ecommerce.API.controller;

import com.Aman.Ecommerce.API.model.User;
import com.Aman.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService service;
    @PostMapping("/addNewUser")
    public void addNewUser(@RequestBody User user){
        service.addUser(user);

    }
}
