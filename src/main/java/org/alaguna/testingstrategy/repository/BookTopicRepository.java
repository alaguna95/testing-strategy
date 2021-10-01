package org.alaguna.testingstrategy.repository;

import org.alaguna.testingstrategy.entity.BookTopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTopicRepository extends JpaRepository<BookTopicEntity, String> {
}
