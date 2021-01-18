package org.alaguna.testingstrategy.controller;

import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<BookOutputDTO>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }
}
