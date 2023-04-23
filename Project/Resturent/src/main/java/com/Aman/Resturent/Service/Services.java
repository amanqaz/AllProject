package com.Aman.Resturent.Service;


import com.Aman.Resturent.Dao.databases;
import com.Aman.Resturent.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class Services {
    @Autowired
    databases database;
    public Restaurant getById(String id) {
        return database.getById(Integer.parseInt(id));


    }

    public String addUser(Restaurant newEntry) {

       return database.addEntry(newEntry);
    }

    public List<Restaurant> getAll() {
        List<Restaurant> user = new ArrayList<>();
        HashMap<Integer,Restaurant> sets = database.getdatabase();
        for(Map.Entry<Integer,Restaurant> data : sets.entrySet()){
            user.add(data.getValue());

        }
        return user;

    }

    public String upadateSpeciality(String data,String id) {
        Restaurant temp = database.getById(Integer.valueOf(id));
        if( temp !=null){
            temp.setSpecialty(data);
            return "Update seccessFull Thanks For Using our services";
        }else{
            return "Please enter vaild Id";
        }
    }

    public String deleteUser(String id) {
        return database.deleteUser(Integer.parseInt(id));
    }
}
