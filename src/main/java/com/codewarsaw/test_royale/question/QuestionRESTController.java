package com.codewarsaw.test_royale.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionRESTController {

  QuestionService questionService;

  @Autowired
  public QuestionRESTController(QuestionService questionService) {
    this.questionService = questionService;
  }

  @GetMapping
  public ResponseEntity<?>getQuestions() {
    List<Question> questions;
    try {
      questions = questionService.findAll();
      return ResponseEntity.status(200).body(questions);
    } catch(NullPointerException e) {
      return ResponseEntity.status(204).body(e.getMessage());
    }
  }
}
