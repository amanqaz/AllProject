package com.Aman.Mapping.repositatory;

import com.Aman.Mapping.model.Book;
import com.Aman.Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo  extends JpaRepository<Book,Long> {
}
