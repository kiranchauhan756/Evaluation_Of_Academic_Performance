package com.spring.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "COURSE", nullable = false)
    private String course;


    @Column(name = "YEAR", nullable = false)
    private int year;

    @Column(name = "SECTION", nullable = false)
    private String section;


    @Column(name = "FATHER_NAME", nullable = false)
    private String fatherName;

    @Column(name = "MOTHER_NAME", nullable = false)
    private String motherName;


    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "ALTER_EMAIL", nullable = false)
    private String alternateEmail;


    @Column(name = "ROLL_NUM", nullable = false)
    private String rollNum;

    @Column(name = "ROLE", nullable = false)
    private String role;

    @Column(name = "MENTOR", nullable = false)
    private String mentor;


    @Column(name = "BRANCH", nullable = false)
    private String branch;


    @Column(name = "DOB", nullable = false)
    private String dob;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Column(name = "SEMESTER", nullable = false)
    private String semester;


    @Column(name = "PHONE_NUM", nullable = false)
    private String phone;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
