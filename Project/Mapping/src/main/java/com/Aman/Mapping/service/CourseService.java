package com.Aman.Mapping.service;

import com.Aman.Mapping.model.Course;
import com.Aman.Mapping.model.Student;
import com.Aman.Mapping.repositatory.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;
    @Autowired
    StudentService studentService;
    public void addCourse(List<Course> course, Long id) {
        Student student = studentService.findById ( id );
        if(student !=null){
            student.setCourse ( course );
            iCourseRepo.saveAll ( course );
        }
    }

    public void deleteCourseById(Long id) {
        iCourseRepo.deleteById ( id );
    }

    public void changeCourseName(Long id, String newName) {
        Course course = iCourseRepo.findById ( id ).get();
        course.setDescription ( newName );
        iCourseRepo.save ( course );

    }

    public List<Course> getAllCourse() {
       return iCourseRepo.findAll ();
    }
}
