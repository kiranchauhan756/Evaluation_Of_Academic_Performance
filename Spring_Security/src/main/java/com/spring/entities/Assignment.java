package com.spring.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Assignment")
public class Assignment {
    @Id
    @Column(name = "ASS_TYPE")
    private String assType;

    @Column(name = "OBT_ASS_MARKS")
    private int obtainedAssMarks;

    @Column(name = "MAX_ASS_MARKS")
    private int maxAssMarks;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "ASSIGNMENT_TYPE",
            joinColumns = {@JoinColumn(name = "assignment_type", nullable = true)},
            inverseJoinColumns = {@JoinColumn(name = "subject_id", nullable = true)})
    private List<Subject> subjects = new ArrayList<>();

    public String getAssType() {
        return assType;
    }

    public void setAssType(String assType) {
        this.assType = assType;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getObtainedAssMarks() {
        return obtainedAssMarks;
    }

    public void setObtainedAssMarks(int obtainedAssMarks) {
        this.obtainedAssMarks = obtainedAssMarks;
    }

    public int getMaxAssMarks() {
        return maxAssMarks;
    }

    public void setMaxAssMarks(int maxAssMarks) {
        this.maxAssMarks = maxAssMarks;
    }
}
