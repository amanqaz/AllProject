package com.Aman.Instagram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String password;
   @NotNull
    private String email;
    private String phoneNumber;
    @OneToOne(mappedBy = "user")
    private AuthenticationToken token;

    @OneToMany(mappedBy = "users")
    private List<Post> posts;

}
