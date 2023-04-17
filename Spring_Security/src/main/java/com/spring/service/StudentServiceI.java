package com.spring.service;

import com.spring.entities.Student;

import java.util.List;

public interface StudentServiceI {
    Student addStudent(Student student);

    Student updateStudent(String email, Student student);

    void deleteStudent(String email);

    List<Student> getAllStudents();
}
