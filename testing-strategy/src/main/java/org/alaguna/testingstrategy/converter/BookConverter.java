package org.alaguna.testingstrategy.converter;

import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;

public class BookConverter {

    public BookOutputDTO entityToDTO(BookEntity book){

        BookTopicConverter bookTopicConverter = new BookTopicConverter();

        return new BookOutputDTO(book.getId(), book.getName(), book.getSheetsNumber(),
                bookTopicConverter.entityToDTO(book.getBookTopic()));
    }

}
