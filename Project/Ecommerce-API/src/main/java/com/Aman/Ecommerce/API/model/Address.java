package com.Aman.Ecommerce.API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private  String name;
    private String phoneNumber;
    private String zipcode;
    private String state;

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "user_id_id")
   private User  UserID;                  // : foreign key mapping
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "addressID")

    private List<Orders> orders;

}
