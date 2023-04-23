package com.Aman.Resturent.Dao;

import com.Aman.Resturent.Model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository

public class databases {


    public HashMap<Integer, Restaurant> getdatabase(){
        return dataSet;
    }
    HashMap<Integer , Restaurant> dataSet ;

    public databases() {
        dataSet = new HashMap<>();
        dataSet.put(0,new Restaurant("Ramesh Daba","near mata rani mandir","92343439474","panner tarka",10,0));
    }

    public Restaurant getById(int id) {
        if(dataSet.containsKey(id)){
            return dataSet.get(id);
        }else{
            return null;
        }
    }

    public String addEntry(Restaurant newEntry) {
        dataSet.put(newEntry.getId(),newEntry);
        return "User Added Thanks for Using us !!!....";
    }

    public String deleteUser(int id) {
       if(dataSet.containsKey(id) ){
           dataSet.remove(id);
           return "User Deleted from database Sorry .....!!!!!!";
       }
       return "user Not Found ";
    }
}
