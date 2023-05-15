package com.Aman.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(mappedBy = "student"cas)
    private Address address;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;

    @ManyToMany(mappedBy = "studentList")
    private List<Course> course;

    @OneToMany(mappedBy = "student")
    private List<Book> books;
}
