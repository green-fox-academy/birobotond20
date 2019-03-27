package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.LogEntry;
import com.greenfoxacademy.frontend.repository.LogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogEntryService {

    private LogEntryRepository logEntryRepository;

    @Autowired
    public LogEntryService(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    public void saveLogEntry(LogEntry newLogEntry) {
        this.logEntryRepository.save(newLogEntry);
    }

    public List<LogEntry> findAllLogEntries(){
        return (List<LogEntry>) this.logEntryRepository.findAll();
    }
}
