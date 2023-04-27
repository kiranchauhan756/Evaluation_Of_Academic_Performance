package com.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SUBJECT")
public class Subject {
    @Id
    @Column(name="SUB_CODE")
    private String subjectCode;
    @Column(name="SUB_NAME")
    private String subjectName;


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






