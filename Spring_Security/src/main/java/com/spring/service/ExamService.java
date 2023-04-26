package com.spring.service;

import com.spring.entities.Exam;
import com.spring.repo.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService implements  ExamServiceI{

    @Autowired
    private ExamRepository examRepository;
    @Override
    public Exam addExam(Exam exam) {
        Exam exam1=this.examRepository.save(exam);
        return exam1;
    }
}
