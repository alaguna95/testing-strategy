package org.alaguna.testingstrategy.service;

import org.alaguna.testingstrategy.converter.BookConverter;
import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookConverter bookConverter;

    @Autowired
    public BookService (BookRepository bookRepository){
        this.bookRepository = bookRepository;
        bookConverter = new BookConverter();
    }

    public List<BookOutputDTO> getAll(){
        List<BookEntity> books = bookRepository.findAll();

        List<BookOutputDTO> booksDTO = new ArrayList<>();
        for(BookEntity book : books){
            booksDTO.add(bookConverter.entityToDTO(book));
        }

        return booksDTO;
    }
}
