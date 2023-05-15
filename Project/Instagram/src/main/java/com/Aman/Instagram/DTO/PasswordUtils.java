package com.Aman.Instagram.DTO;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordUtils {
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public  String encryptPassword(String password) {
        return passwordEncoder.encode(password);
    }

    public  boolean matchPassword(String password, String encryptedPassword) {
        return passwordEncoder.matches(password, encryptedPassword);
    }


}
