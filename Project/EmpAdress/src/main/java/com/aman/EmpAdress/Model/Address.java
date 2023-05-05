package com.aman.EmpAdress.Model;

import com.aman.EmpAdress.Repositatory.EmpRepo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private  Long id ;
    private String street ;
    private String city ;
    private String state ;
    private String  zipcode ;

    // forienge key contraint
    @OneToOne(cascade = CascadeType.ALL)
    private Employee emp;






}
