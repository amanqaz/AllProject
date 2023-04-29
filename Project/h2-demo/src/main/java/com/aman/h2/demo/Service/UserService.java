package com.aman.h2.demo.Service;

import com.aman.h2.demo.DAO.Repo;
import com.aman.h2.demo.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    Repo database;
    public  Iterable<Users> getAllUser() {
        Iterable<Users> findall =database.findAll();
        return findall;
    }

    public String adduser(List<Users> usersList) {

        Iterable<Users> dataset =  database.saveAll(usersList);
       if(dataset !=null) return "User Added on database";
       else return "No";
    }
}
