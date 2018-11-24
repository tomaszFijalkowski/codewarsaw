package com.codewarsaw.test_royale.student;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findAll();
}