package com.UserManagement.UserManagment.Service;

import com.UserManagement.UserManagment.DAO.Repo;
import com.UserManagement.UserManagment.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class Services {
    @Autowired
   private Repo database;

    public Iterable<Users> getAllUsers() {
        return database.findAll ();

    }

    public String addUser(Users users) {
        Users temp = database.save (users);
        if(temp !=null) return "Yes";
        return "No Please Try Again After Some time";


    }

    public Optional<Users> getUserByID(String id) {
        Optional<Users> temp = database.findById( Integer.parseInt ( id ) );
        return temp;
    }

    public Users updateUserInfo(int id, Users users) {
        Users user = database.findById ( id ).get();
        user.setUsername ( users.getUsername () );
        user.setEmail ( users.getEmail () );
        user.setAge ( users.getAge () );
        database.save ( user );
        return user;
    }

    public String deleteUserById(int id) {
        database.deleteById ( id );
        return "deleted successfully";
    }
}
