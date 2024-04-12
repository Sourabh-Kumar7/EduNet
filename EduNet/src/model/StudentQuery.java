/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class StudentQuery {
    private static int lastAssignedId = 0; // Static variable to keep track of the last assigned ID
    private int queryId; // Auto-incremented query ID
    private int studentId;
    private int professorId;
    private int courseId;
    private String queryTitle;
    private String queryText;
    private String queryResolution;
    private boolean isAnswered;

    public StudentQuery(int studentId, int professorId, int courseId, String queryTitle, String queryText) {
        this.queryId = lastAssignedId++;
        this.studentId = studentId;
        this.professorId = professorId;
        this.courseId = courseId;
        this.queryTitle = queryTitle;
        this.queryText = queryText;
        this.queryResolution = null;
        this.isAnswered = false;
    }

    public int getQueryId() {
        return queryId;
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

    public String getQueryTitle() {
        return queryTitle;
    }

    public String getQueryText() {
        return queryText;
    }

    public String getQueryResolution() {
        return queryResolution;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void markAsAnswered(String resolution) {
        queryResolution = resolution;
        isAnswered = true;
    }

    // Other methods and setters can be added as needed
}
