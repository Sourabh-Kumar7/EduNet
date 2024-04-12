/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sourabhkumar
 */
public class StudentCourseProgress {
    private int studentId;
    private Map<Integer, CourseProgress> courseProgressMap;

    public StudentCourseProgress(int studentId) {
        this.studentId = studentId;
        this.courseProgressMap = new HashMap<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public Map<Integer, CourseProgress> getCourseProgressMap() {
        return courseProgressMap;
    }

    public void setCourseProgress(int courseId, CourseProgress progress) {
        courseProgressMap.put(courseId, progress);
    }

    public CourseProgress getCourseProgress(int courseId) {
        return courseProgressMap.get(courseId);
    }

    public boolean hasCompletedCourse(int courseId) {
        CourseProgress progress = courseProgressMap.get(courseId);
        return progress != null && progress.isCompleted();
    }
}
