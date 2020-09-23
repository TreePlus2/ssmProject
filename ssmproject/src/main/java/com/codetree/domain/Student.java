package com.codetree.domain;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    private String sid;
    private String name;
    private String gender;
    private String grade;
    private Date birth;
    private String major;

    public Student() {
    }

    public Student(String sid, String name, String gender, String grade, Date birth, String major) {
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.birth = birth;
        this.major = major;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", birth=" + birth +
                ", major='" + major + '\'' +
                '}';
    }
}
