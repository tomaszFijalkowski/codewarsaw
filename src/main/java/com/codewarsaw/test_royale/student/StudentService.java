package com.codewarsaw.test_royale.student;

import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
}
