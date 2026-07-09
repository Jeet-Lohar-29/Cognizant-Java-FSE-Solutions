package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.entity.Book;
import com.library.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // Get all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    // Add new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // Update existing book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book updatedBook) {

        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {

            Book book = optionalBook.get();

            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());

            return bookRepository.save(book);
        }

        return null;
    }

    // Delete book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {

        bookRepository.deleteById(id);

        return "Book Deleted Successfully";

    }

}