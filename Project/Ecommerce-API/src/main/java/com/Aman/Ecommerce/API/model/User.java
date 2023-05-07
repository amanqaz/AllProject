package com.Aman.Ecommerce.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  Id;
    private String  name;
    private String  email;
    private String   password;
    private String   phoneNumber;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "UserID")
    private List<Address> address;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "users")
    private List<Orders> orders ;

    // @OneToMany(cascade=CascadeType.ALL,mappedBy = "")




}
