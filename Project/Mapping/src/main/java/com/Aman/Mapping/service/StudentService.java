package com.Aman.Mapping.service;

import com.Aman.Mapping.model.Student;
import com.Aman.Mapping.repositatory.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
    IStudentRepo iStudentRepo;

    public Student findById(Long id) {
        return iStudentRepo.findByID (id);

    }

    public void addStudent(Student student) {
        iStudentRepo.save ( student );
    }

    public void deleteById(Long id) {

        iStudentRepo.deleteById ( id );
    }
}
