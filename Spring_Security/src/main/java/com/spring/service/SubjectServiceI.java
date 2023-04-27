package com.spring.service;

import com.spring.entities.Exams;
import com.spring.entities.Subject;

import java.util.List;

public interface SubjectServiceI{
    List<Subject> getAllSubjects();
    Subject updateSubject(String subjectCode,Subject subject);
    void  deleteSubject(String subjectCode);

    Subject addSubject(Subject subject);

    Subject findSubject(String subjectCode);

    Subject updateMarks(String subjectCode, Exams exams);
  //  Subject updateAssignments(String subjectCode, Subject subject);
}
