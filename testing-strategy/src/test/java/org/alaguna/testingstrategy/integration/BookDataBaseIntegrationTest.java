package org.alaguna.testingstrategy.integration;

import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookDataBaseIntegrationTest extends IntegrationTests{

    @Autowired
    private BookRepository bookRepository;

    @Test
    void saveBook() {

        BookEntity book = new BookEntity(1L, "Book1", 20);

        bookRepository.save(book);

        //TODO: IS THIS THE BEST WAY TO ASSERT INTEGRATION TESTS?
    }

}
