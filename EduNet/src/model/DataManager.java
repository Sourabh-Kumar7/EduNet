/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.*;

/**
 *
 * @author sourabhkumar
 */
public class DataManager {
    public static Map<Integer, User> userMap = new HashMap<>(); //user id to user
    public static Map<String, User> emailUserMap = new HashMap<>(); //user id to user
    public static Map<Integer, Professor> professorMap = new HashMap<>(); //user id to instructor
    public static Map<Integer, Student> studentMap = new HashMap<>(); //user id to student
    public static Map<Integer, User> degreeAuthorityMap = new HashMap<>(); //uid to degree authority
    public static Map<Integer, User> adminMap = new HashMap<>(); //user id to user who is admin
    public static Map<Integer, List<StudentFeedback>> courseFeedbackMap = new HashMap<>(); //course_id to the list of feedback he have given
    public static Map<Integer, List<StudentFeedback>> studentFeedbackMap = new HashMap<>(); //student_id to the list of feedback he have given
    public static Map<Integer, List<StudentFeedback>> professorFeedbackMap = new HashMap<>(); // instructor id to list of feedback he received from student
    public static Map<Integer, Course> courseMap = new HashMap<>(); //course id to course
    public static Map<Integer, List<StudentQuery>> studentQueryMap = new HashMap<>(); //student_id to the list of query he have given
    public static Map<Integer, List<StudentQuery>> professorQueryMap = new HashMap<>(); // instructor id to list of query he received from student
    public static Map<Integer, StudentQuery> queryMap = new HashMap<>(); //query id to query
    public static Map<Integer, StudentCourseProgress> studentCourseProgressMap = new HashMap<>(); //user id to student course progress
    public static List<Integer> requestForDegree = new ArrayList<>(); //student user id who requested for degree
}
