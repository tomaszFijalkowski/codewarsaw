package com.codewarsaw.test_royale.entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int experience = 0;

    private int money = 0;

    private int answeredRight = 0;
    private int answeredWrong = 0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAnsweredRight() {
        return answeredRight;
    }

    public void setAnsweredRight(int answeredRight) {
        this.answeredRight = answeredRight;
    }

    public int getAnsweredWrong() {
        return answeredWrong;
    }

    public void setAnsweredWrong(int answeredWrong) {
        this.answeredWrong = answeredWrong;
    }
}
