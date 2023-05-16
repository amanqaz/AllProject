package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Course;
import com.Aman.Mapping.repositatory.ICourseRepo;
import com.Aman.Mapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")

public class CoursesController {
    @Autowired
    CourseService courseService;
    @Autowired
    private ICourseRepo iCourseRepo;


    @PostMapping("name/{id}")
    public void addCourse(@RequestBody List<Course> course , @PathVariable Long id){
        courseService.addCourse(course,id);

    }
    @DeleteMapping("delete/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourseById(id);
    }
    @PutMapping("courseNameUpdate/{id}/newName")
    public void changeCourseName(@PathVariable Long id , @PathVariable String newName){
        courseService.changeCourseName(id,newName);
    }

    @GetMapping("allCourse")
    public List<Course>allCourses(){
       return  courseService.getAllCourse();
    }



}
