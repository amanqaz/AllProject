package com.Aman.Mapping.repositatory;

import com.Aman.Mapping.model.Course;
import com.Aman.Mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo  extends JpaRepository<Laptop,Long> {
}
