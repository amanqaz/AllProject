package com.Aman.Ecommerce.API.repositatory;

import com.Aman.Ecommerce.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
