package com.example.table.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SUBJECT")
public class Subject {
    @Id
    @Column(name = "SUBCODE")
    private String subCode;
    @Column(name = "SUBNAME", nullable = false)
    private String subName;

    @JsonBackReference
    @ManyToMany(mappedBy = "subjects")
    private List<Student> students = new ArrayList<>();

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
