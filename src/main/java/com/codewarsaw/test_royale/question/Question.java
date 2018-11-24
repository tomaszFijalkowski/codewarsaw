package com.codewarsaw.test_royale.question;

import javax.persistence.*;

@Entity
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String category;
  private String questionText;
  private String goodAnswer;

  public Question() {
  }

  public Question(String category, String questionText, String goodAnswer) {
    this.category = category;
    this.questionText = questionText;
    this.goodAnswer = goodAnswer;
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

  public String getGoodAnswer() {
    return goodAnswer;
  }

  public void setGoodAnswer(String goodAnswer) {
    this.goodAnswer = goodAnswer;
  }
}
