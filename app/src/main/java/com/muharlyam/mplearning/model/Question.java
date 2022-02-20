package com.muharlyam.mplearning.model;

import java.time.LocalDateTime;

public class Question {

    private Integer id;
    private String answer;
    private String question;
    private Integer value;
    private LocalDateTime airdate;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer category_id;
    private Integer game_id;
    private Integer invalid_count;
    Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LocalDateTime getAirdate() {
        return airdate;
    }

    public void setAirdate(LocalDateTime airdate) {
        this.airdate = airdate;
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

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public Integer getInvalid_count() {
        return invalid_count;
    }

    public void setInvalid_count(Integer invalid_count) {
        this.invalid_count = invalid_count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
