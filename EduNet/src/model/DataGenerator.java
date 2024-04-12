/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;
import static model.DataManager.adminMap;
import static model.DataManager.degreeAuthorityMap;
import static model.DataManager.emailUserMap;
import static model.DataManager.professorMap;
import static model.DataManager.studentCourseProgressMap;
import static model.DataManager.studentMap;
import static model.DataManager.userMap;

/**
 *
 * @author sourabhkumar
 */
public class DataGenerator {
    private static final String[] FIRST_NAMES = {"John", "Alice", "Bob", "Emma", "David", "Sarah", "Arun", "Sourabh", "Amar", "Arjun","Priti", "Sangam"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Brown", "Davis", "Wilson", "Lee", "Kumar", "Yadav", "Singh", "Sandhu"};
    private static final String[] GENDERS = {"Male", "Female"};
    private static final String[] EMAIL_DOMAINS = {"example.com", "test.com", "domain.com"};

    private static final int PASSWORD_LENGTH = 10; // You can adjust the password length
    
    public static User generateUser(String userType) throws CustomExceptions.InvalidPasswordException {
        String firstName = getRandomElement(FIRST_NAMES);
        String lastName = getRandomElement(LAST_NAMES);
        String fullName = firstName + " " + lastName; 
        Date dob = generateRandomDate();
        String gender = getRandomElement(GENDERS);
        String email = generateRandomEmail(firstName, lastName);
        String phoneNumber = generateRandomPhoneNumber();
        boolean isEnabled = true;

        // Check for duplicate email
        if (emailUserMap.containsKey(email)) {
            System.out.println("Generated User with duplicate email: " + email + ". Skipping...");
            return null; // Return null to indicate that the user was not created
        }

        String password = PasswordGenerator.generatePassword(PASSWORD_LENGTH);
        String hashedPassword = HashingUtil.hashString(password);
        // Create the user based on isAdmin
        User user = new User(fullName, dob, gender, email, phoneNumber, hashedPassword, isEnabled, userType);
        
        switch (userType) {
            case "Admin" -> adminMap.put(user.getId(), user);
            case "Student" -> {
                Student student = new Student(user.getId());
                studentMap.put(user.getId(), student);
                StudentCourseProgress studentCourseProgress = new StudentCourseProgress(user.getId());
                studentCourseProgressMap.put(user.getId(), studentCourseProgress);
            }
            case "Professor" -> {
                Professor prof = new Professor(user.getId());
                professorMap.put(user.getId(), prof);
                int courseCount = new Random().nextInt(10)+1;
                generateCoursesForProfessor(user.getId(), courseCount);
            }
            case "DegreeAuthority" -> {
                degreeAuthorityMap.put(user.getId(), user);
            }
            
            default -> {
            }
        }
        
        userMap.put(user.getId(), user);
        emailUserMap.put(user.getEmail(), user);
        
        System.out.println("Generated User with email: " + email);
        System.out.println("Generated Password: " + password);
        System.out.println("User Type: " + userType);
        
        return user;
    }
    
    public static void generateCoursesForProfessor(int professorId, int courseCount) {
        Professor professor = DataManager.professorMap.get(professorId);

        if (professor == null) {
            System.out.println("Professor with ID " + professorId + " not found.");
            return;
        }


        for (int i = 0; i < courseCount; i++) {
            String courseName = "Course " + (i + 1);
            String description = "Description for Course " + (i + 1);
            double courseFees = 50.0 + (new Random().nextDouble() * 450.0); // Random course fees between 50 and 500
            DecimalFormat df = new DecimalFormat("#.00");
            courseFees = Double.parseDouble(df.format(courseFees));
            String[] semesters = {"Spring", "Summer", "Fall"};
            String semester = semesters[new Random().nextInt(semesters.length)]; // Randomly select a semester
            int year = 2023 + new Random().nextInt(5); // Random year between 2024 and 2028

            Course course = new Course(courseName, professorId, description, courseFees, semester, year);
            DataManager.courseMap.put(course.getCourseId(), course);
            professor.addCreatedCourse(course.getCourseId());
//            // Increment the count of enrolled students for demonstration
//            int randomEnrollments = new Random().nextInt(50); // Simulate random enrollments
//            for (int j = 0; j < randomEnrollments; j++) {
//                course.incrementEnrolledStudents();
//            }
        }
        System.out.println("Generated " + courseCount + " courses for Professor " + professorId);
    }


    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }

    private static Date generateRandomDate() {
        // Generate a random date, e.g., by using Random or other date generation logic
        // Replace this with your actual date generation logic
        // For simplicity, I'll return the current date as an example
        return new Date();
    }

    private static String generateRandomEmail(String firstName, String lastName) {
        String domain = getRandomElement(EMAIL_DOMAINS);
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
    }

    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9"); // Start with '9' to ensure a valid Indian mobile number
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10)); // Append random digits from 0 to 9
        }
        return phoneNumber.toString();
    }

    private static String generateRandomUsername(String firstName, String lastName) {
        return firstName.toLowerCase() + lastName.toLowerCase() + new Random().nextInt(1000);
    }
}