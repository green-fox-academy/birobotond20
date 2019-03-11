package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySqlApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public ConnectionWithMySqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.deleteAll();
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn Implementing a SQL database in Java"));
        todoRepository.save(new Todo("I have to learn to remain calm with Thymeleaf"));
        todoRepository.save(new Todo("Walk the dog", true, false));
        todoRepository.save(new Todo("Water plants", true, true));
    }
}
