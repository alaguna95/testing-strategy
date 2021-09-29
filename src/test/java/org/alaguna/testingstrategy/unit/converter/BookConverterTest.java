package org.alaguna.testingstrategy.unit.converter;

import org.alaguna.testingstrategy.converter.BookConverter;
import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.dto.BookTopicOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.objects.dto.BookTopicDtoObjectMother;
import org.alaguna.testingstrategy.objects.entity.BookBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookConverterTest {

    private BookConverter bookConverter = new BookConverter();

    @Test
    public void convertEntityToDTO(){
        BookBuilder bookBuilder = new BookBuilder();
        BookEntity book = bookBuilder.build();

        BookOutputDTO bookDTO = bookConverter.entityToDTO(book);

        assertEquals(book.getId(), bookDTO.getId());
        assertEquals(book.getName(), bookDTO.getName());
        assertEquals(book.getSheetsNumber(), bookDTO.getSheetsNumber());
        assertEquals(BookTopicDtoObjectMother.historical(), bookDTO.getBookTopic());
    }
}
