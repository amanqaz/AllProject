package com.Aman.Instagram.service;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.Aman.Instagram.DTO.PasswordUtils;
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
    private PasswordUtils passwordUtils;

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

    private boolean isPresent(String email){
        User dbUser=  userRepo.findByemail ( email );
        if(dbUser == null ) return  false;
        return true;

    }

    public ResponseEntity<String> signIn(SignIn credential) {

        String response ="user Or password invalid please check credential or try to signin";
        HttpStatus status = HttpStatus.BAD_REQUEST;

        String credentialEmail = credential.getEmail ();


       if(isPresent ( credentialEmail )){

            boolean passwordVerified =   verificationUser ( credentialEmail,credential.getPassword () );

           if(passwordVerified) {

               status = HttpStatus.ACCEPTED;
               User dbUser=  userRepo.findByemail (credentialEmail );


               String token = dbUser.getToken ( ).getToken ( );
               response = token;
               return ResponseEntity.ok ( response );
       }
       }
        return ResponseEntity.status ( status ).body ( response );
    }

    public ResponseEntity<String> updateEmail(String oldEmail, String newEmail, String password) {
        boolean entryCheck = isPresent ( oldEmail );
        if (entryCheck) {
            boolean match = verificationUser ( oldEmail, password );
            if (match) {
                User dbUser = userRepo.findByemail ( oldEmail );

                dbUser.setEmail ( newEmail );
                userRepo.save ( dbUser );

                return ResponseEntity.status ( HttpStatus.ACCEPTED ).body ( "Email updated" );


            }
        }
         return   ResponseEntity.status ( HttpStatus.BAD_REQUEST ).body ( "Invalid user or Password please try again" );

    }
//    private  boolean (String email,String password){
//        User dbUser=  userRepo.findByemail ( email );
//
//        String tempPassword  = password;
//        String dbPassword = dbUser.getPassword ();
//
//        tempPassword = encryption ( tempPassword );
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        boolean matches = encoder.matches(tempPassword, dbPassword);
//        if(matches) return  true;
//        return false;
//    }

    public boolean verificationUser(String email, String password) {
        User dbUser=  userRepo.findByemail ( email );

        String encryptedPassword = dbUser.getPassword ();
        return passwordUtils.matchPassword(password, encryptedPassword);
    }

    public User getUserByEmail(String email) {
        return  userRepo.findByemail ( email );


    }


}
