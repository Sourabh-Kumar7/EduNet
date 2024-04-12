/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.CustomExceptions.InvalidCourseFeesException;

import model.CustomExceptions.InvalidDateOfBirthException;
import model.CustomExceptions.InvalidDescriptionException;
import model.CustomExceptions.InvalidEmailException;
import model.CustomExceptions.InvalidNameException;
import model.CustomExceptions.InvalidPasswordException;
import model.CustomExceptions.InvalidPhoneNumberException;
import model.CustomExceptions.InvalidPicturePathException;
import model.CustomExceptions.InvalidSemesterException;
import model.CustomExceptions.InvalidUsernameException;
import model.CustomExceptions.InvalidYearException;
/**
 *
 * @author sourabhkumar
 */
public class validationUtil {

    public static void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be empty or null.");
        }
        if (name.length() > 50) {
            throw new InvalidNameException("Name is too long.");
        }
    }

    public static void validateDateOfBirth(Date dob) throws InvalidDateOfBirthException {
        if (dob == null) {
            throw new InvalidDateOfBirthException("Date of birth cannot be null.");
        }
        // Check if the date of birth is in the past
        Date currentDate = new Date();
        if (dob.after(currentDate)) {
            throw new InvalidDateOfBirthException("Date of birth must be in the past.");
        }
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty or null.");
        }

        // Use a stricter regular expression pattern for email validation
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$";

        if (!Pattern.matches(emailPattern, email)) {
            throw new InvalidEmailException("Invalid email address format.");
        }
    }

    // Define a regular expression pattern for valid phone numbers (10 digits)
    private static final String PHONE_REGEX = "^[0-9]{10}$";
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new InvalidPhoneNumberException("Phone number cannot be empty or null.");
        }
        // Use regular expression to validate phone number format
        if (!Pattern.matches(PHONE_REGEX, phoneNumber)) {
            throw new InvalidPhoneNumberException("Invalid phone number format. It should be 10 digits.");
        }
    }

    public static void validatePicturePath(String picPath) throws InvalidPicturePathException {
        if (picPath == null || picPath.trim().isEmpty()) {
            throw new InvalidPicturePathException("Picture path cannot be empty or null.");
        }
        // Check if the file extension is supported (.jpg or .png)
        String lowercasePath = picPath.toLowerCase();
        if (!(lowercasePath.endsWith(".jpg") || lowercasePath.endsWith(".jpeg") || lowercasePath.endsWith(".png"))) {
            throw new InvalidPicturePathException("Invalid picture file format. Supported formats: .jpg, .jpeg, .png");
        }
        // Additional checks for the picture path can be added, such as checking if the file exists.
    }
    
    public static void validateUsername(String username) throws InvalidUsernameException {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty.");
        }
        if (username.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters long.");
        }
        // You can add more validation rules for the username if needed.
    }
    
    public static void validatePassword(String password) throws InvalidPasswordException {
        /**
        * Validates a password based on the following rules:
        * - Must not be empty.
        * - Must be at least 8 characters long.
        * - Must contain at least one digit (number).
        * - Must contain at least one special character from the following list:
        *   ! @ # $ % ^ & * ( ) _ + - = [ ] { } ; : ' " < > , . ? / \
        *
        * @param password The password to validate.
        * @throws InvalidPasswordException If the password is invalid based on the rules.
        */
        if (password == null || password.trim().isEmpty()) {
            throw new InvalidPasswordException("Password cannot be empty.");
        }
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }
        // Check if the password contains at least one digit (number).
        if (!Pattern.compile(".*\\d.*").matcher(password).matches()) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }
        // Check if the password contains at least one special character.
        if (!Pattern.compile(".*[!@#$%^&*()_+\\-=\\[\\]{};:'\"<>,.?/\\\\].*").matcher(password).matches()) {
            throw new InvalidPasswordException("Password must contain at least one special character.");
        }
    }
    
    public static void validateDescription(String description) throws InvalidDescriptionException {
        if (description == null || description.trim().isEmpty()) {
            throw new InvalidDescriptionException("Description cannot be empty or null.");
        }
        if (description.length() > 500) {
            throw new InvalidDescriptionException("Description is too long.");
        }
    }

    public static void validateYear(int year) throws InvalidYearException {
        if (year < 2023 || year > 2100) {
            throw new InvalidYearException("Invalid year. Year must be between 2023 and 2100.");
        }
    }

    public static void validateCourseSemester(String semester) throws InvalidSemesterException {
        if (!semester.equals("Fall") && !semester.equals("Spring") && !semester.equals("Summer")) {
            throw new InvalidSemesterException("Invalid semester. Supported semesters: Fall, Spring, Summer.");
        }
    }

    public static void validateCourseFees(double courseFees) throws InvalidCourseFeesException {
        if (courseFees < 0) {
            throw new InvalidCourseFeesException("Course fees cannot be negative.");
        }
    }


}
