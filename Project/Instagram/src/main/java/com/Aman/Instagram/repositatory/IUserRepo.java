package com.Aman.Instagram.repositatory;

import com.Aman.Instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {

   User findByemail(String email);
}
