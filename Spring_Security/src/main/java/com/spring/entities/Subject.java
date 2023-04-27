package com.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT")
public class Subject {
    @Id
    private String subjectCode;

    private String subjectName;

    private Exams exams;


    public Exams getExams() {
        return exams;
    }

    public void setExams(Exams exams) {
        this.exams = exams;
    }


    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }


    public String getSubjectName() {
        return subjectName;
    }


    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}






