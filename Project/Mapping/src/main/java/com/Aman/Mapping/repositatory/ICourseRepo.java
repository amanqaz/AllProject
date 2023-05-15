package com.Aman.Mapping.repositatory;

import com.Aman.Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
