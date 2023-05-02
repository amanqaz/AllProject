package com.EventManagement.UniversitySystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int studentId;
@NotBlank(message = "first name cannot be Empty")
    private String firstName;
    private String lastName;
    @Max (25 )
    @Min ( 18 )
    private int age;
    @Column(name = "branch")
    @Enumerated(EnumType.STRING)
   private Department branch;

}
