package com.codewarsaw.test_royale.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{

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
