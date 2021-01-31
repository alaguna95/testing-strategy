package org.alaguna.testingstrategy.converter;

import org.alaguna.testingstrategy.dto.BookOutputDTO;
import org.alaguna.testingstrategy.dto.BookTopicOutputDTO;
import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.entity.BookTopicEntity;

public class BookTopicConverter {

    public BookTopicOutputDTO entityToDTO(BookTopicEntity bookTopic){
        return new BookTopicOutputDTO(bookTopic.getId(), bookTopic.getName());
    }
}
