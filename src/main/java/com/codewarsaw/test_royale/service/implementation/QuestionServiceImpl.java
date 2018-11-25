package com.codewarsaw.test_royale.service.implementation;

import com.codewarsaw.test_royale.dao.QuestionRepository;
import com.codewarsaw.test_royale.entity.Question;
import com.codewarsaw.test_royale.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long questionId) {
        return questionRepository.findById(questionId).get();
    }
}
