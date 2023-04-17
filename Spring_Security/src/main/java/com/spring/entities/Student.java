package com.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="STUDENT")
public class Student {
    @Id
    @Column(name="EMAIL",nullable=false)
    private String email;

    @Column(name="FIRST_NAME",nullable=false)
    private String firstName;

    @Column(name="LAST_NAME",nullable=false)
    private String lastName;

    @Column(name="PASSWORD",nullable=false)
    private String password;

    @Column(name="COURSE",nullable=false)
    private String course;


    @Column(name="YEAR",nullable=false)
    private String year;

    @Column(name="SECTION",nullable=false)
    private String section;


    @Column(name="FATHER_NAME",nullable=false)
    private String fatherName;

    @Column(name="MOTHER_NAME",nullable=false)
    private String motherName;


    @Column(name="ADDRESS",nullable=false)
    private String address;

    @Column(name="ALTER_EMAIL",nullable=false)
    private String alternateEmail;

    @Column(name="ROLL_NUM",nullable=false)
    private String rollNum;

    @Column(name="MENTOR",nullable=false)
    private String mentor;

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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name="BRANCH",nullable=false)
    private String branch;


    @Column(name="DOB",nullable=false)
    private Date dob;


    @Column(name="PHONE_NUM",nullable=false)
    private String phone;
}