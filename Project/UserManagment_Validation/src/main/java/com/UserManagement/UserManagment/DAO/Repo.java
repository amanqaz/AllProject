package com.UserManagement.UserManagment.DAO;

import com.UserManagement.UserManagment.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repo extends JpaRepository<Users,Integer> {

}
