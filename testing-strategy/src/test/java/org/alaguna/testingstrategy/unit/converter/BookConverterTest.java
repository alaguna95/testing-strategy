package org.alaguna.testingstrategy.unit.converter;

import org.alaguna.testingstrategy.converter.BookConverter;
import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookConverterTest {

    private BookConverter bookConverter = new BookConverter();

    @Test
    public void convertEntityToDTO(){
        BookEntity book = new BookEntity();
        book.setId(1L);
        book.setName("bookName");

        BookOutputDTO bookDTO = bookConverter.entityToDTO(book);

        assertEquals(1L, bookDTO.getId());
        assertEquals("bookName", bookDTO.getName());
    }
}
