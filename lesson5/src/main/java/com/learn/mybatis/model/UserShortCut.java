package com.learn.mybatis.model;

public class UserShortCut {
    private String username;
    private Integer age;

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

    public UserShortCut(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public UserShortCut() {
    }
}