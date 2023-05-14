package com.Aman.Instagram.service;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.Aman.Instagram.DTO.SignIn;
import com.Aman.Instagram.model.User;
import com.Aman.Instagram.repositatory.IUserRepo;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    TokenService tokenService;


    private static final String SECRET_KEY = "my-secret-key";
    public ResponseEntity<String> signUp(User user) throws Exception {
        User repoUser = userRepo.findByemail ( user.getEmail ( ) );
        System.out.print(repoUser);
        String response = null;
        HttpStatus status;
        if (repoUser != null){
            response = "user already exists please sign in Instead of signUp";
            status = HttpStatus.BAD_REQUEST;
        }
        else {

            user.setPassword ( encryption ( user.getPassword ( ) ) );

            userRepo.save ( user );

            // generating the token after user is saved
            // encryption required
           User realUser = userRepo.findByemail ( user.getEmail ( ) );
            tokenService.genratingToken ( realUser);


            response="you have secessfully signUp please Login";
            status=HttpStatus.CREATED;


        }

        return ResponseEntity.status (status).body ( response );
    }

    private String encryption(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder ( );
        return encoder.encode ( password );

    }

    public ResponseEntity<String> signIn(SignIn credential) {

        String response ="user Or password invalid please check credential or try to signin";
        HttpStatus status = HttpStatus.BAD_REQUEST;

        String credentialEmail = credential.getEmail ();
       User dbUser=  userRepo.findByemail ( credentialEmail );
       if(dbUser ==null){
           return ResponseEntity.badRequest().body ( response );
       }else{
           String tempPassword  = credential.getPassword ();
           String dbPassword = dbUser.getPassword ();

               tempPassword = encryption ( tempPassword );
               BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
               boolean matches = encoder.matches(tempPassword, dbPassword);
              if(matches) {
                  response = tempPassword;
                  status = HttpStatus.ACCEPTED;


                      String token = dbUser.getToken ( ).getToken ( );
                      response = token;
                      return ResponseEntity.ok ( response );


              }else{

               return ResponseEntity.status ( status ).body ( response );
           }
       }
    }
}
