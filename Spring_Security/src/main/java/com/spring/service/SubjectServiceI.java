package com.spring.service;

import com.spring.entities.Subject;

import java.util.List;

public interface SubjectServiceI{
    List<Subject> getAllSubjects();
    Subject updateSubject(String subjectCode,Subject subject);
    void  deleteSubject(String subjectCode);

    Subject addSubject(Subject subject);
}
