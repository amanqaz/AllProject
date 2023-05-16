package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Book;
import com.Aman.Mapping.repositatory.IBookRepo;
import com.Aman.Mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    private IBookRepo iBookRepo;

    @PostMapping("addBook")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @PutMapping("update/{title}/{id}")
        public void updateTitle(@PathVariable String title,@PathVariable Long id){

        bookService.updateTitle(title,id);
     }
     @DeleteMapping("{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
     }

     @GetMapping("getAllBook")
    public List<Book> getAllBook(){
      return   bookService.getAllBook();
     }

}
