package com.codewarsaw.test_royale.dao;

import com.codewarsaw.test_royale.entity.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

    List<Answer> findByQuestionId(long questionId);
}
