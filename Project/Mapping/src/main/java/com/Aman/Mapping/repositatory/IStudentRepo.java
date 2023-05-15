package com.Aman.Mapping.repositatory;

import com.Aman.Mapping.model.Course;
import com.Aman.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo  extends JpaRepository<Student,Long> {


    public Student findByID(Long id);
}
