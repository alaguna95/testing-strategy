package org.alaguna.testingstrategy.dao;

import org.alaguna.testingstrategy.entity.BookTopicEntity;
import org.alaguna.testingstrategy.exception.ContentNotFoundException;
import org.alaguna.testingstrategy.repository.BookTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookTopicDao {

    private final BookTopicRepository bookTopicRepository;

    @Autowired
    public BookTopicDao (BookTopicRepository bookTopicRepository){
        this.bookTopicRepository = bookTopicRepository;
    }

    public BookTopicEntity getById(String id){
        return bookTopicRepository.findById(id).orElseThrow(() -> {
            return new ContentNotFoundException("Book topic not found with id: " + id);
        });
    }
}
