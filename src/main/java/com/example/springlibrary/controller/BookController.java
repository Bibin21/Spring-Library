package com.example.springlibrary.controller;

import com.example.springlibrary.model.Book;
import com.example.springlibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    
    public List<Book> getAllData() {
        return bookService.getAllBooks();
    }
    @PostMapping("/add")
    public Book addData(@RequestBody Book book) {
        return bookService.addBook(book);
    }

}
