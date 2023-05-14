package com.Aman.Instagram.repositatory;

import com.Aman.Instagram.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken ,Long> {
}
