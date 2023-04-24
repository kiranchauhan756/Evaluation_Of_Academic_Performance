package com.spring.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @Column(name = "SUB_CODE")
    private String subjectCode;

    @Column(name = "SUB_NAME",nullable = false)
    private String subjectName;

    @Column(name = "EXAM_MARKS",nullable=false)
    private int examMarks;

    @Column(name = "MAX_EXAM_MARKS",nullable=false)
    private int maxExamMarks;


    @Column(name = "ASSIGNMENT_MARKS",nullable=false)
    private int assignmentMarks;

    @Column(name = "MAX_ASSIGNMENT_MARKS",nullable=false)
    private int maxAssignmentMarks;


    public int getExamMarks() {
        return examMarks;
    }

    public void setExamMarks(int examMarks) {
        this.examMarks = examMarks;
    }

    public int getMaxExamMarks() {
        return maxExamMarks;
    }

    public void setMaxExamMarks(int maxExamMarks) {
        this.maxExamMarks = maxExamMarks;
    }

    public int getAssignmentMarks() {
        return assignmentMarks;
    }

    public void setAssignmentMarks(int assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public int getMaxAssignmentMarks() {
        return maxAssignmentMarks;
    }

    public void setMaxAssignmentMarks(int maxAssignmentMarks) {
        this.maxAssignmentMarks = maxAssignmentMarks;
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
