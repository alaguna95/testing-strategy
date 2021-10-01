package org.alaguna.testingstrategy.service;

import org.alaguna.testingstrategy.converter.BookConverter;
import org.alaguna.testingstrategy.dao.BookTopicDao;
import org.alaguna.testingstrategy.dto.BookInputDTO;
import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.entity.BookTopicEntity;
import org.alaguna.testingstrategy.repository.BookRepository;
import org.alaguna.testingstrategy.repository.BookTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookTopicDao bookTopicDao;
    private final BookConverter bookConverter;

    @Autowired
    public BookService (BookRepository bookRepository, BookTopicDao bookTopicDao){
        this.bookRepository = bookRepository;
        this.bookTopicDao = bookTopicDao;
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

    public BookOutputDTO create(BookInputDTO bookDTO){

        BookTopicEntity bookTopic = bookTopicDao.getById(bookDTO.getBookTopicId());
        BookEntity book = new BookEntity(bookDTO.getId(),bookDTO.getName(), bookDTO.getSheetsNumber(), bookTopic);

        book = bookRepository.save(book);

        return bookConverter.entityToDTO(book);
    }
}
