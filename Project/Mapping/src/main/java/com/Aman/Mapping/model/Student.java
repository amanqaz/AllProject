package com.Aman.Mapping.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "address")



public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(mappedBy = "student",cascade = CascadeType.REMOVE)
    private Address address;

    @OneToOne(mappedBy = "student",cascade = CascadeType.REMOVE)
    private Laptop laptop;

    @ManyToMany(mappedBy = "studentList",cascade = CascadeType.REMOVE)
    private List<Course> course;

    @OneToMany(mappedBy = "student",cascade = CascadeType.REMOVE)
    private List<Book> books;
}
