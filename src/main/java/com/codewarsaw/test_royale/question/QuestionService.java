package com.codewarsaw.test_royale.question;

import org.springframework.stereotype.Service;

import java.util.List;

public interface QuestionService {

  List<Question> findAll();
}
