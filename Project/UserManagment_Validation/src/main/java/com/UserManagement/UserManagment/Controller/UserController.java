package com.UserManagement.UserManagment.Controller;

import com.UserManagement.UserManagment.Model.Users;
import com.UserManagement.UserManagment.Service.Services;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UserController {
    @Autowired
    Services service;

    @GetMapping(value = "getAllUser")

    public Iterable<Users> getAllUser(){
        return service.getAllUsers();
    }
    @PostMapping(value = "addUser")
    public String addUser( @Valid @RequestBody Users users){
        return service.addUser ( users );
    }
    @GetMapping("getUserById/{Id}")
    public Optional<Users> getUserById(@PathVariable String Id ){
        return service.getUserByID(Id);
        
    }
    @PutMapping("/updateUserInfo/{Id}")
    public Users updateUserInfo(@PathVariable int Id,@RequestBody Users users){
        return service.updateUserInfo(Id,users);
    }
    @DeleteMapping("deleteUserById/{Id}")
    public String deleteUserById(@PathVariable int Id ){
        return service.deleteUserById(Id);

    }


}
