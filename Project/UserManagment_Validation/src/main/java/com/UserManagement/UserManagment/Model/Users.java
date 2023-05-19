package com.UserManagement.UserManagment.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "ID", unique = true )
    private Integer userId;
     @Column(name = "userName")
     @NotBlank(message = "Name is mandatory")
    private String username;


    @Column(name = "Age")
    @Max (25)
    @Min (18)
     private int age;
     @Column(name="email")
     @NotBlank(message = "Email is mandatory")
    private String email;
     @Column(name="phoneNumber")

    private String phoneNumber;
    @Column(name= "Date")
    private Date date = Date.from ( Instant.now ( ) );
    @Column(name="time")
    private Timestamp time = Timestamp.from ( Instant.now ( ) );
}
