package org.alaguna.testingstrategy.repository;

import org.alaguna.testingstrategy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
