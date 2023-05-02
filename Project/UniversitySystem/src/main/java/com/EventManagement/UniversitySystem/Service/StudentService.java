package com.EventManagement.UniversitySystem.Service;

import com.EventManagement.UniversitySystem.Model.Department;
import com.EventManagement.UniversitySystem.Model.Student;
import com.EventManagement.UniversitySystem.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo database;


    public String addStudentLists(List<Student> students) {
        Iterable<Student> data = database.saveAll ( students );
        if( data !=null){
            return "added Successful";
        }else{
            return "Some thing went wrong";

        }


    }

    public Student getStudentById(Integer id) {
       return database.findById ( id ).get();

    }

    public String updateStudentDepartmentById(Department newBranch , Integer id) {
        String deparmentTOString = newBranch.toString ();
        database.updateBranchByID ( deparmentTOString,id  );
        return "update";

    }

    public String deleteStudentById(Integer id) {
        database.deleteById ( id );
        return "Delete is successful";
    }

    public Iterable<Student> getAllStudent() {
        return  database.findAll ();
    }
}
