package com.Aman.JobPortal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_search")

public class JobSearch {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    //
    @Enumerated(EnumType.STRING)// only for conversion of enum data to respective String present
    private JobType jobtype;

    private String companyName;
    private String employerName;
    private LocalDate appliedDate= LocalDate.now ();
}
