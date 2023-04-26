package com.spring.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="EXAM")
public class Exam {
    @Id
    @Column(name="EXAM_TYPE")
    private String examType;

    @Column(name="OBT_EXAM_MARKS")
    private int obtainedExamMarks;

    @Column(name="MAX_EXAM_MARKS")
    private int maxExamMarks;

    public int getObtainedMarks() {
        return obtainedExamMarks;
    }

    public void setObtainedMarks(int obtainedExamMarks) {
        this.obtainedExamMarks = obtainedExamMarks;
    }

    public int getMaxMarks() {
        return maxExamMarks;
    }

    public void setMaxMarks(int maxExamMarks) {
        this.maxExamMarks = maxExamMarks;
    }

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "EXAM_TYPE",
            joinColumns = {@JoinColumn(name = "exam_type", nullable = true)},
            inverseJoinColumns = {@JoinColumn(name = "subject_id", nullable = true)})
    private List<Subject> subjects = new ArrayList<>();

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
