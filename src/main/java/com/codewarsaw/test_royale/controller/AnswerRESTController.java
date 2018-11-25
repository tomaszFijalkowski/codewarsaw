package com.codewarsaw.test_royale.controller;

import com.codewarsaw.test_royale.entity.Answer;
import com.codewarsaw.test_royale.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerRESTController {

    AnswerService answerService;

    @Autowired
    public AnswerRESTController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/api/questions/{questionId}/answers")
    public ResponseEntity<?> getAnswerByQuestionId(@PathVariable Long questionId) {
        List<Answer> answers;

        try {
            answers = answerService.findByQuestionId(questionId);

            return ResponseEntity.status(200).body(answers);
        } catch (NullPointerException e) {
            return ResponseEntity.status(204).body(e.getMessage());
        }
    }

}

