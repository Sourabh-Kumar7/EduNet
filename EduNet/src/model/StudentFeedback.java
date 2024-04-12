/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class StudentFeedback {
    private static int lastAssignedId = 1; // Static variable to keep track of the last assigned ID
    private int feedbackId; // Auto-incremented feedback ID
    private int studentId; 
    private int professorId;
    private int courseId;
    private int rating;
    private String feedbackText;

    public StudentFeedback(int studentId, int professorId, int courseId, int rating, String feedbackText) {
        this.feedbackId = lastAssignedId++;
        this.studentId = studentId;
        this.professorId = professorId;
        this.courseId = courseId;
        this.rating = rating;
        this.feedbackText = feedbackText;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getRating() {
        return rating;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

}

