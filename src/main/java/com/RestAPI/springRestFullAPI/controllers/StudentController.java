package com.RestAPI.springRestFullAPI.controllers;
import com.RestAPI.springRestFullAPI.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    Student student = new Student(1, "Leangsim", "Male");

    @GetMapping
    Student getStudent() {
        return student;
    }
}