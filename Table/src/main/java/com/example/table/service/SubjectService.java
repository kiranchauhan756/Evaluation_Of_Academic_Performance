package com.example.table.service;

import com.example.table.entity.Subject;
import com.example.table.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService implements SubjectServiceI{

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject addSubject(Subject subject) {
        Subject sub1=this.subjectRepository.save(subject);
        return sub1;
    }

    @Override
    public Subject findBySubjectCode(String subCode) {
        Subject subject=this.subjectRepository.findBySubCode(subCode);
        return subject;
    }
}
