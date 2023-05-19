package com.aman.h2.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true )
    private int userId;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    private LocalDate dob;


}
