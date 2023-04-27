package com.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "EXAMS")
public class Exams {
    @Id
    @Column(name = "EXAM_TYPE")
    private String examType;

    @Column(name = "MAX_EXAM_MARKS")
    private int maxExamMarks;

    @Column(name = "OBT_EXAM_MARKS")
    private int obtainedExamMarks;




    public int getMaxExamMarks() {
        return maxExamMarks;
    }

    public void setMaxExamMarks(int maxExamMarks) {
        this.maxExamMarks = maxExamMarks;
    }


    public int getObtainedExamMarks() {
        return obtainedExamMarks;
    }

    public void setObtainedExamMarks(int obtainedExamMarks) {
        this.obtainedExamMarks = obtainedExamMarks;
    }


    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
}