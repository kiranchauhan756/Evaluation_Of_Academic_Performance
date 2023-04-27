package com.spring.service;

import com.spring.entities.Exams;
import com.spring.entities.Subject;
import com.spring.repo.ExamRepository;
import com.spring.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamService implements ExamServiceI{

    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Exams addExams(Exams exams) {
        return this.examRepository.save(exams);
    }

    @Override
    public Exams assignSubjectToExam(String subjectCode, Exams exam) {
        Subject bySubjectCode = this.subjectRepository.findBySubjectCode(subjectCode);
        Optional<Exams> exams = this.examRepository.findById(exam.getExamType());
        if(exams.isPresent()) {
          //  exams.get().setSubject(bySubjectCode);
            return examRepository.save(exams.get());
        }
        return null;
    }
}
