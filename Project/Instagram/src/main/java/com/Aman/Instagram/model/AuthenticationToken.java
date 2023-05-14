package com.Aman.Instagram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor


public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private LocalDate date;
    @OneToOne()
    @JoinColumn(nullable = false, name = "fk_user_ID")
    private User user;


    // genrating a token for user
    public AuthenticationToken( User user){
        this.user =  (user);
        this.date = LocalDate.now ();
        this.token = UUID.randomUUID().toString ();

    }





}
