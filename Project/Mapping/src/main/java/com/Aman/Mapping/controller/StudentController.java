package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Student;
import com.Aman.Mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    public void addStudent(Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteById(id);

    }
    @PutMapping("updatePhoneNo/{id}/{newPhoneNo}")
    public void updatePhoneNo(@PathVariable Long id , @PathVariable String newPhoneNo){
        studentService.updatePhoneNoById(id,newPhoneNo);
    }
    @GetMapping("/getAllUser")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

}
