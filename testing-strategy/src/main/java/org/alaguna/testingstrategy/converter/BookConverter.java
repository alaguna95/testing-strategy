package org.alaguna.testingstrategy.converter;

import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;

public class BookConverter {

    public BookOutputDTO entityToDTO(BookEntity book){
        return new BookOutputDTO(book.getId(), book.getName());
    }

}
