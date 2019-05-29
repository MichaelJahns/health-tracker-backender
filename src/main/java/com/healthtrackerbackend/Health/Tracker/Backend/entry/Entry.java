package com.healthtrackerbackend.Health.Tracker.Backend.entry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entry {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String length;
    private int mood;

    public Entry() {

    }

    public Entry(String description, String length, int mood) {
        this.description = description;
        this.length = length;
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
    //GEt and Set some things
    // i dont think we need a join table
}
