package com.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @Column(name = "SUB_CODE", nullable = false)
    private String subjectCode;

    @Column(name = "SUB_NAME", nullable = false)
    private String subjectName;

    @Column(name = "COURSE", nullable = false)
    private String course;

    @Column(name = "BRANCH", nullable = false)
    private String branch;

    @Column(name = "YEAR", nullable = false)
    private int year;

    @Column(name = "SEMESTER", nullable = false)
    private String semester;

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

}
