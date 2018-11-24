package com.codewarsaw.test_royale.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

  QuestionRepository questionRepository;

  @Autowired
  public QuestionServiceImpl(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  @Override
  public List<Question> findAll() {
    return questionRepository.findAll();
  }
}
