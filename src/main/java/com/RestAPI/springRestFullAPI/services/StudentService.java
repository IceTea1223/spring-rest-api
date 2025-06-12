package com.RestAPI.springRestFullAPI.services;
import com.RestAPI.springRestFullAPI.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    Student student = new Student(1, "Leangsim", "Male");
    public Student getStudent() {
        return student;
    }
}