package com.codewarsaw.test_royale.controller;

import com.codewarsaw.test_royale.entity.Student;
import com.codewarsaw.test_royale.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class StudentRESTController {

    StudentService studentService;

    @Autowired
    public StudentRESTController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public ResponseEntity<?> getStudents() {
        List<Student> students;

        try {
            students = studentService.findAll();

            return ResponseEntity.status(200).body(students);
        } catch (NullPointerException e) {
            return ResponseEntity.status(204).body(e.getMessage());
        }
    }

    @GetMapping("/api/students/{studentId}")
    public ResponseEntity<?> getStudentById(@PathVariable long studentId) {
        Student student;

        try {
            student = studentService.findById(studentId);

            return ResponseEntity.status(200).body(student);
        } catch (NullPointerException e) {
            return ResponseEntity.status(204).body(e.getMessage());
        }
    }

}
