package com.greenfoxacademy.redditapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private int numberOfVotes;
    @Temporal(TemporalType.DATE)
    private Date datePostedOn;

    public Post() {
        this.datePostedOn = new Date();
        this.numberOfVotes = (int) (1 + (Math.random() * 101));
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.numberOfVotes = (int) (1 + (Math.random() * 101));
        this.datePostedOn = new Date();
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumberOfVotes() {
        return this.numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes += numberOfVotes;
    }

    public Date getDatePostedOn() {
        return datePostedOn;
    }

    public void setDatePostedOn(Date datePostedOn) {
        this.datePostedOn = datePostedOn;
    }
}
