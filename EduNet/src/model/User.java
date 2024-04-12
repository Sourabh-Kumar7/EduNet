/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sourabhkumar
 */
public class User {
    private static int lastAssignedId = 0; // Static variable to keep track of the last assigned ID
    private int id;
    private String name;
    private Date dob;
    private String gender;
    private String email;
    private String phoneNum;
    private String picPath;
    private String hashedPassword; // Store the hashed password as a string
    private boolean isEnabled;
    private String userType;

    public User(String name, Date dob, String gender, String email, String phoneNum, String hashedPassword, boolean isEnabled, String userType) {
        this.id = ++lastAssignedId; // Auto-increment the ID
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.phoneNum = phoneNum;
        this.hashedPassword = hashedPassword;
        this.isEnabled = isEnabled;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", picPath='" + picPath + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", isEnabled=" + isEnabled +
                ", userType='" + userType + '\'' +
                '}';
    }
}
