/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sourabhkumar
 */
public class Student {
    private static int lastAssignedId = 0;
    private int id;
    private int userId;
    private List<Integer> enrolledCoursesId;
    private String degreeStatus;

    // Constructors
    public Student() {
        this.id = lastAssignedId++;
        this.enrolledCoursesId = new ArrayList<>();
        this.degreeStatus = "";
    }

    public Student(int userId) {
        this();
        this.userId = userId;
        this.degreeStatus = "";
    }

    public String getDegreeStatus() {
        return degreeStatus;
    }

    public void setDegreeStatus(String degreeStatus) {
        this.degreeStatus = degreeStatus;
    }    

    // Getters and setters
    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getEnrolledCoursesId() {
        return enrolledCoursesId;
    }

    // Method to add a course to the enrolledCoursesId list
    public void addEnrolledCourse(int courseId) {
        enrolledCoursesId.add(courseId);
    }

    // Method to remove a course from the enrolledCoursesId list
    public void removeEnrolledCourse(int courseId) {
        enrolledCoursesId.remove(Integer.valueOf(courseId));
    }

}
