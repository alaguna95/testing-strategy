package org.alaguna.testingstrategy.repository;

import org.alaguna.testingstrategy.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, String> {
}
