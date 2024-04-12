/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class Course {
    private static int lastAssignedId = 0; // Static variable to keep track of the last assigned ID
    private int courseId;
    private String courseName;
    private int instructorID;
    private String description;
    private double courseFees;
    private int countEnrolledStudents;
    private String semester;
    private int year;
    private boolean active;
    private double rating;

    // Constructor
    public Course(String courseName, int instructorID, String description, double courseFees, String semester, int year) {
        this.courseId = ++lastAssignedId; // Auto-increment the ID
        this.courseName = courseName;
        this.instructorID = instructorID;
        this.description = description;
        this.courseFees = courseFees;
        this.countEnrolledStudents = 0; // Default to 0 enrolled students
        this.semester = semester;
        this.year = year;
        this.rating = 5;
        this.active = true;
    }

    // Getter and Setter methods for courseId, courseFees, instructorID, and countEnrolledStudents
    public int getCourseId() {
        return courseId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = Math.round(rating * 100.0) / 100.0;
    }
    

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(double courseFees) {
        this.courseFees = courseFees;
    }

    public int getCountEnrolledStudents() {
        return countEnrolledStudents;
    }

    public void incrementEnrolledStudents() {
        countEnrolledStudents++;
    }

    public void decrementEnrolledStudents() {
        if (countEnrolledStudents > 0) {
            countEnrolledStudents--;
        }
    }
    
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructorID='" + instructorID + '\'' +
                ", description='" + description + '\'' +
                ", courseFees=" + courseFees +
                ", countEnrolledStudents=" + countEnrolledStudents +
                ", semester='" + semester + '\'' +
                ", year=" + year +
                '}';
    }
}


