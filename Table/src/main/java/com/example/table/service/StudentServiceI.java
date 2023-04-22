package com.example.table.service;

import com.example.table.dto.SubjectStudentRequest;
import com.example.table.entity.Student;

public interface StudentServiceI {
    Student addUser(Student student);
    Student findById(int id);

    Student assignSubject(int id,String subCode);

}
