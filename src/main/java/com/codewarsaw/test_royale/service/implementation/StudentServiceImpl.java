package com.codewarsaw.test_royale.service.implementation;

import com.codewarsaw.test_royale.dao.StudentRepository;
import com.codewarsaw.test_royale.entity.Student;
import com.codewarsaw.test_royale.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long studentId) {
        return studentRepository.findById(studentId);
    }
}