package com.codewarsaw.test_royale.service;

import com.codewarsaw.test_royale.entity.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> findAllByQuestionId(int questionId);
}
