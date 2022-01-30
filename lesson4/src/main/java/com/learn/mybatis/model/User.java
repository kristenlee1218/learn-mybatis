package com.learn.mybatis.model;

/**
 * @author : Kristen
 * @date : 2022/1/30
 * @description :
 */
public class User {
    private Long id;
    private String username;
    private Integer age;
    private Integer score;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public User(Long id, String username, Integer age, Integer score) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.score = score;
    }
}