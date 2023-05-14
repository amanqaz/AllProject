package com.Aman.Instagram.service;

import com.Aman.Instagram.model.AuthenticationToken;
import com.Aman.Instagram.model.User;
import com.Aman.Instagram.repositatory.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    ITokenRepo iTokenRepo;

    public void genratingToken(User user) {
        AuthenticationToken token = new AuthenticationToken (  user );



        iTokenRepo.save (token );

    }

    // saving token


}
