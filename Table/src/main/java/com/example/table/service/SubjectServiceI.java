package com.example.table.service;

import com.example.table.entity.Subject;

public interface SubjectServiceI {
    Subject addSubject(Subject subject);
    Subject findBySubjectCode(String subCode);
}
