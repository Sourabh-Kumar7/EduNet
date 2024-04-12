/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author sourabhkumar
 */
import java.util.List;
import java.util.ArrayList;

public class Professor {
    private static int lastAssignedId = 0;
    private int id;
    private int userId;
    private List<Integer> createdCourseIds;
    private double totalRevenue;

    public Professor(int userId) {
        this.id = lastAssignedId++;
        this.userId = userId;
        this.createdCourseIds = new ArrayList<>();
        this.totalRevenue = 0.0;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public List<Integer> getCreatedCourseIds() {
        return createdCourseIds;
    }

    public void addCreatedCourse(int courseId) {
        createdCourseIds.add(courseId);
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void updateTotalRevenue(double revenue) {
        totalRevenue += revenue;
    }
}

