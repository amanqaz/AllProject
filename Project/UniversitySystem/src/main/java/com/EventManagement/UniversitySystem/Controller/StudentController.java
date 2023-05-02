package com.EventManagement.UniversitySystem.Controller;

import com.EventManagement.UniversitySystem.Model.Department;
import com.EventManagement.UniversitySystem.Model.Student;
import com.EventManagement.UniversitySystem.Service.StudentService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/getAllStudents")
    public Iterable<Student> getAllStudent(){
        return service.getAllStudent();
    }
    @PostMapping("/addStudentLists")
    public String addStudentLists(@Valid @RequestBody List<Student> students){
        return service.addStudentLists(students);
    }
    @GetMapping("/getStudentById/{id}")
    public Student getStudentById( @PathVariable  Integer id){
        return service.getStudentById(id);

    }
    @Transactional
    @PutMapping("/updateStudentDepartmentById/{id}/{newDepartment}")
    public String updateStudentDepartmentById(@PathVariable Integer id, @PathVariable Department newDepartment){
        return service.updateStudentDepartmentById(newDepartment,id);
    }
    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return service.deleteStudentById(id);
    }

}
