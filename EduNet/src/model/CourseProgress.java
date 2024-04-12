/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class CourseProgress {
    private double progress; // Progress as a percentage (e.g., 0.0 to 100.0)
    private boolean completed; // Indicates if the course is completed

    public CourseProgress(double progress) {
        this.progress = progress;
        this.completed = false;
    }

    public double getProgress() {
        return progress;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

