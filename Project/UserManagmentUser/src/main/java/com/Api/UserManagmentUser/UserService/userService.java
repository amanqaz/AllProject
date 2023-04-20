package com.Api.UserManagmentUser.UserService;


import com.Api.UserManagmentUser.UserDAO.userDAO;
import com.Api.UserManagmentUser.UserService.Model.userObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class userService {

    @Autowired
    userDAO database;


    public String addNewUser(userObject userData) {
        boolean insertionStatus = database.addUser(userData);//in our case...always true
        if(insertionStatus)
        {
            return "Todo added successfully!!!!!";
        }
        else
        {
            return "Failed!!!!!....Todo Not possible..Database error";//in case of database error ...will see later

        }


    }

    public userObject getOnlyUserByID(int userId) {

        List<userObject> Alluser = database.gellAll();

       for(userObject obj: Alluser){


           if(userId == obj.getUserId()){
               return obj;
           }
       }
       return new userObject(3,"","","","");

    }

    public List<userObject> getAll() {
        return database.gellAll();
    }

    public String updateInfo(int id, String updatedData) {

        List<userObject> copydatabase = database.gellAll();
       // int checkId = Integer.parseInt(id);
        for(userObject obj : copydatabase){
            if(obj.getUserId() == id){
                copydatabase.remove(obj);
                obj.setPhone_Number(updatedData);
                copydatabase.add(obj);
                return " update is secessfull";
            }

        }
        return "id not found Please try again";
    }

    public String deleteuser(String id) {
        int newid = Integer.parseInt(id);
        return database.deleteUser(newid);
    }
}
