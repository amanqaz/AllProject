package com.Aman.Mapping.service;

import com.Aman.Mapping.model.Laptop;
import com.Aman.Mapping.model.Student;
import com.Aman.Mapping.repositatory.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;
    @Autowired
    StudentService studentService;
    public void laptopDetailForStudent(Laptop laptop, Long id) {
        Student student = studentService.findById ( id );
        if(student !=null){
            student.setLaptop ( laptop );
            iLaptopRepo.save ( laptop );
        }

    }

    public void unAssignLaptopToStudent(Long id) {
        Student student = studentService.findById ( id );
        if(student !=null){
            student.setLaptop (new Laptop () );
            iLaptopRepo.deleteById ( student.getLaptop ().getID () );
        }

    }

    public void updateAssetOfStudent(Laptop laptop, Long id) {
        Student student = studentService.findById ( id );
        if(student !=null){
            Long tempId = student.getLaptop ().getID ();
            laptop.setID ( tempId );
            student.setLaptop ( laptop );
            iLaptopRepo.save ( laptop );
        }
    }

    public List<Laptop> allLaptop() {
      return   iLaptopRepo.findAll ();
    }
}
