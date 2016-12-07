package com.example.myapplication;

import cn.bmob.v3.BmobObject;

/**
 * Created by againstit on 2016/12/5.
 */

public class Person extends BmobObject {
    private String name;
    private String college;
    private String grade;
    private String password;
    private String major;
    private String sex;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCollege() {
        return college;
    }

    public String getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
