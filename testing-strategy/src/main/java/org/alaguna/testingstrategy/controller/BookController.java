package org.alaguna.testingstrategy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @GetMapping("/books")
    public String getAllBooks() {
        return "book1, book2";
    }
}
