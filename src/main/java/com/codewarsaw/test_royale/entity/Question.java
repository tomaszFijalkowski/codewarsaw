package com.codewarsaw.test_royale.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String category;
  private String questionText;
  private List<Answer> answers = new ArrayList<>();

  public Question() {
  }

  public Question(String category, String questionText) {
    this.category = category;
    this.questionText = questionText;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public boolean checkAnswer(Answer answer){
    return answer.isCorrect();
  }
}
