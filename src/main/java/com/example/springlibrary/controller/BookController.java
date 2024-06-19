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

    @GetMapping(value = "/all", params = { "genre" })
    public List<Book> getAllData(@RequestParam(value = "genre") String genre ,@RequestParam(value = "name",required = false) String name) {
        return bookService.getBooksByGenre(genre);
    }

    @GetMapping(value = "/all", params = { "authorId" })
    public List<Book> getAllData(@RequestParam(value = "authorId") long authorId) {
        return bookService.getBooksByAuthorId(authorId);
    }
    @GetMapping(value = "/all", params = { "name" })
    public List<Book> getAllData(@RequestParam(value = "name") String name) {
        return bookService.getBooksByName(name);
    }

    @PostMapping("/add")
    public Book addData(@RequestBody Book book) {
        return bookService.addBook(book);
    }



}
