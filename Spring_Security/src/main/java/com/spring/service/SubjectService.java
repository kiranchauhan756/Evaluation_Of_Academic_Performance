package com.spring.service;

import com.spring.entities.Subject;
import com.spring.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements SubjectServiceI {

    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public List<Subject> getAllSubjects() {
        return this.subjectRepository.findAll();
    }

    @Override
    public Subject updateSubject(String subjectCode, Subject subject) {
        Subject subject1=this.subjectRepository.findBySubjectCode(subjectCode);
        subject1.setSubjectName(subject.getSubjectName());
        this.subjectRepository.save(subject1);
        return subject1;
    }

    @Override
    public void deleteSubject(String subjectCode) {

        Subject subject = this.subjectRepository.findBySubjectCode(subjectCode);
        this.subjectRepository.delete(subject);
    }

    @Override
    public Subject addSubject(Subject subject) {
        return this.subjectRepository.save(subject);
    }

    @Override
    public Subject findSubject(String subjectCode) {
        Subject subject=this.subjectRepository.findBySubjectCode(subjectCode);
        return subject;
    }
}
