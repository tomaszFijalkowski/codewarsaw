package com.codewarsaw.test_royale.service.implementation;

import com.codewarsaw.test_royale.dao.AnswerRepository;
import com.codewarsaw.test_royale.dao.QuestionRepository;
import com.codewarsaw.test_royale.entity.Answer;
import com.codewarsaw.test_royale.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    AnswerRepository answerRepository;

    @Autowired
    public AnswerServiceImpl(QuestionRepository questionRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> findAllByQuestionId(int questionId) {
        return answerRepository.findAllByQuestionId(questionId);
    }
}
