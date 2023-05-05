package com.aman.EmpAdress.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String firstName ;
    private String lastName ;
    private String address ;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "emp")

    private Address userAddress;

}
