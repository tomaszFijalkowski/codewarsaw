package com.codewarsaw.test_royale.controller;

import com.codewarsaw.test_royale.entity.Question;
import com.codewarsaw.test_royale.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionRESTController {

    QuestionService questionService;

    @Autowired
    public QuestionRESTController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/api/questions")
    public ResponseEntity<?> getQuestions() {
        List<Question> questions;

        try {
            questions = questionService.findAll();

            return ResponseEntity.status(200).body(questions);
        } catch (NullPointerException e) {
            return ResponseEntity.status(204).body(e.getMessage());
        }
    }

    @GetMapping("/api/questions/{questionId}")
    public ResponseEntity<?> getQuestionById(@PathVariable long questionId) {
        Question question;

        try {
            question = questionService.findById(questionId);

            return ResponseEntity.status(200).body(question);
        } catch (NullPointerException e) {
            return ResponseEntity.status(204).body(e.getMessage());
        }
    }

}
