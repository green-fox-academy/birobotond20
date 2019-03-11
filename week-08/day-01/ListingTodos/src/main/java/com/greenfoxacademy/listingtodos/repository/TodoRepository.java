package com.greenfoxacademy.listingtodos.repository;

import com.greenfoxacademy.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
