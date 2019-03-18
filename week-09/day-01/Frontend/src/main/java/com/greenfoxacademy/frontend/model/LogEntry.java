package com.greenfoxacademy.frontend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String endpoint;
    private String data;
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public LogEntry() {
        this.createdAt = new Date();
    }

    public LogEntry(String endpoint, String data, Date createdAt) {
        this.endpoint = endpoint;
        this.data = data;
        this.createdAt = new Date();
    }

    public long getId() {
        return id;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
