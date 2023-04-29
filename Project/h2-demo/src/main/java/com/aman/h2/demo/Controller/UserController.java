package com.aman.h2.demo.Controller;


import com.aman.h2.demo.Model.Users;
import com.aman.h2.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping(value = "/user")
    public  Iterable<Users> getUser(){
        return service.getAllUser();
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody List<Users> usersList){
        return service.adduser(usersList);

    }
}
