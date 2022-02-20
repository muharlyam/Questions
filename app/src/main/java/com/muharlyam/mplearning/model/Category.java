package com.muharlyam.mplearning.model;

import java.time.LocalDateTime;

public class Category {
    private Integer id;
    private String title;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer clues_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getClues_count() {
        return clues_count;
    }

    public void setClues_count(Integer clues_count) {
        this.clues_count = clues_count;
    }
}
