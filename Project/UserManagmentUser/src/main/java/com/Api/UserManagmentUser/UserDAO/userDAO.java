package com.Api.UserManagmentUser.UserDAO;

import com.Api.UserManagmentUser.UserService.Model.userObject;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userDAO {

//    @Autowired
//    userObject obj;
       List<userObject> dataSet;


    public userDAO()
    {
       dataSet = new ArrayList<>();

        dataSet.add(new userObject(0 , "unknown","user420","USA ","3945739895728"));
    }


    public boolean addUser(userObject userData) {
        dataSet.add(userData);
        return true;
    }

    public List<userObject> gellAll(){
        return  dataSet;
    }


    public String deleteUser(int id) {

        for(userObject obj :dataSet){
            if(obj.getUserId() == id){
                dataSet.remove(obj);
                return "User deleted...!!!";
            }
        }
        return "please check User Id Again and try with vaild user Id";

    }
}

