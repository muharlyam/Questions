package com.muharlyam.mplearning.model;

import java.util.Date;

public class Question {
    private Integer id;
    private String answer;
    private String question;
    private Integer value;
    private Date airdate;
    private Date created_at;
    private Date updated_at;
    private Integer category_id;
    private Object game_id;
    private Object invalid_count;
    private Category category;

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

    public Date getAirdate() {
        return airdate;
    }

    public void setAirdate(Date airdate) {
        this.airdate = airdate;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Object getGame_id() {
        return game_id;
    }

    public void setGame_id(Object game_id) {
        this.game_id = game_id;
    }

    public Object getInvalid_count() {
        return invalid_count;
    }

    public void setInvalid_count(Object invalid_count) {
        this.invalid_count = invalid_count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
