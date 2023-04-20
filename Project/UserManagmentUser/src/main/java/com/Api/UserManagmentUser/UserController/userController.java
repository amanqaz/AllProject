package com.Api.UserManagmentUser.UserController;


import com.Api.UserManagmentUser.UserService.Model.userObject;
import com.Api.UserManagmentUser.UserService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController




public class userController {

    @Autowired
    userService service;

    @PostMapping(value = "/addUser")

    public String addUser(@RequestBody userObject userData){
        return service.addNewUser(userData);
    }

    @GetMapping(value="/getUser/{userId}")
    public userObject getOnlyUser(@PathVariable  String userId){
        return service.getOnlyUserByID(Integer.parseInt(userId));
    }

    @GetMapping(value = "/AllUser")
    public List<userObject> getAll(){
        return service.getAll();
    }

  @PutMapping(value = "/updateUserInfo/{id}/{parameter}")

    public String userUpdate(@PathVariable int  id, @PathVariable String parameter){
        return service.updateInfo(id ,parameter);
  }

  @DeleteMapping(value = "/deleteUserById/{id}")

    public String deleteuser(@PathVariable String id){
        return service.deleteuser(id);
  }
}
