package com.example.table.service;

import com.example.table.dto.SubjectStudentRequest;
import com.example.table.entity.Student;
import com.example.table.entity.Subject;
import com.example.table.repo.StudentRepository;
import com.example.table.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceI {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Student addUser(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student findById(int id) {

        Student student =this.studentRepository.findById(id);
        return student;
    }

    @Override
    public Student assignSubject(int id,String subCode) {
        Student student =this.studentRepository.findById(id);
        Subject subject=this.subjectRepository.findBySubCode(subCode);
        student.getSubjects().add(subject);
        studentRepository.save(student);
        return student;
    }

}
