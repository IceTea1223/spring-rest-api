package com.RestAPI.springRestFullAPI.controllers;
import com.RestAPI.springRestFullAPI.entity.Student;
import com.RestAPI.springRestFullAPI.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    Student getStudent() {
        return studentService.getStudent();
    }
}