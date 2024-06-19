package com.example.springlibrary.service;

import com.example.springlibrary.model.Book;
import com.example.springlibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book)
    {
        return bookRepository.save(book);
    }
    public Book getBookById(long bookId)
    {
        Optional<Book> res = bookRepository.findById(bookId);
        if(res.isPresent())
        {
            return res.get();
        }
        return null;
    }
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
    public List<Book> getBooksByName(String name)
    {
        return bookRepository.findByName(name);
    }
    public List<Book> getBooksByGenre(String genre)
    {
        return bookRepository.findByGenre(genre);
    }
    public List<Book> getBooksByAuthorId(long authorId)
    {
        return bookRepository.findByAuthorId(authorId);
    }


}
