package com.codewarsaw.test_royale.dao;

import com.codewarsaw.test_royale.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findAll();

    Student findById(Long id);
}