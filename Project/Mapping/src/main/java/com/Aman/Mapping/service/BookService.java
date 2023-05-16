package com.Aman.Mapping.service;

import com.Aman.Mapping.model.Book;
import com.Aman.Mapping.repositatory.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;
    public void addBook(Book book) {
        iBookRepo.save ( book );
    }

    public void updateTitle(String title, Long id) {
        Book book = iBookRepo.findById ( id ).get();
        book.setTitle ( title );
        iBookRepo.save ( book );
    }

    public void deleteBook(Long id) {
        iBookRepo.deleteById ( id );
    }

    public List<Book> getAllBook() {
        return  iBookRepo.findAll ();
    }
}
