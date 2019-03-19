package com.greenfoxacademy.frontend.repository;

import com.greenfoxacademy.frontend.model.LogEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepository extends CrudRepository<LogEntry, Long> {
}
