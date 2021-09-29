package org.alaguna.testingstrategy.integration;

import org.alaguna.testingstrategy.entity.BookEntity;
import org.alaguna.testingstrategy.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
class IntegrationTests {

	@Container
	protected static PostgreSQLContainer container = new PostgreSQLContainer("postgres:13.1")
			.withUsername("duke")
			.withPassword("password")
			.withDatabaseName("test");


	// requires Spring Boot >= 2.2.6
	@DynamicPropertySource
	protected static void properties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", container::getJdbcUrl);
		registry.add("spring.datasource.password", container::getPassword);
		registry.add("spring.datasource.username", container::getUsername);
	}



}
