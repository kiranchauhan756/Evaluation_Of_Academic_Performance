package com.spring.service;

import com.spring.entities.Exams;

public interface ExamServiceI {
    Exams addExams(Exams exams);

    Exams assignSubjectToExam(String subjectCode, Exams exam);
}
