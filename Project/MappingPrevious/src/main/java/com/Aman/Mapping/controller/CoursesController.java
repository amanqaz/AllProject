package com.Aman.Mapping.controller;

import com.Aman.Mapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")

public class CoursesController {
    @Autowired
    CourseService courseService;
}
