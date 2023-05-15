package com.Aman.Instagram.controller;

import com.Aman.Instagram.DTO.SignIn;
import com.Aman.Instagram.model.User;
import com.Aman.Instagram.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("signup")
    public ResponseEntity< String>  signUp(@RequestBody User user){

        try {
            return userService.signUp(user);
        } catch (Exception e) {
            throw new RuntimeException ( e );
        }
    }


    @PostMapping("signin")
    public ResponseEntity<String> signIn(@RequestBody SignIn credential){
       return  userService.signIn(credential);
    }
    @Transactional
    @PutMapping("update/{oldEmail}/{newEmail}/{password}")
    public ResponseEntity<String> emailUpdate(@PathVariable String oldEmail,@PathVariable String newEmail,@PathVariable String password){
        return userService.updateEmail(oldEmail,newEmail,password);
    }




}
