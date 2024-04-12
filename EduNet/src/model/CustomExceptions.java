/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
public class CustomExceptions {
    public static class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    public static class InvalidDateOfBirthException extends Exception {
        public InvalidDateOfBirthException(String message) {
            super(message);
        }
    }

    public static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    public static class InvalidPhoneNumberException extends Exception {
        public InvalidPhoneNumberException(String message) {
            super(message);
        }
    }

    public static class InvalidPicturePathException extends Exception {
        public InvalidPicturePathException(String message) {
            super(message);
        }
    }

    // Custom exceptions for the User class
    public static class InvalidUsernameException extends Exception {
        public InvalidUsernameException(String message) {
            super(message);
        }
    }

    public static class InvalidPidException extends Exception {
        public InvalidPidException(String message) {
            super(message);
        }
    }

    public static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

    public static class UserNotFoundException extends Exception {
        public UserNotFoundException(String message) {
            super(message);
        }
    }

    public static class DuplicateUserException extends Exception {
        public DuplicateUserException(String message) {
            super(message);
        }
    }

    public static class AuthenticationFailureException extends Exception {
        public AuthenticationFailureException(String message) {
            super(message);
        }
    }
    
    public static class SamePasswordAsOldException extends Exception {
        public SamePasswordAsOldException(String message) {
            super(message);
        }
    }
    
    public static class InvalidDescriptionException extends Exception {
        public InvalidDescriptionException(String message) {
            super(message);
        }
    }
    
    public static class InvalidYearException extends Exception {
        public InvalidYearException(String message) {
            super(message);
        }
    }
    
    public static class InvalidSemesterException extends Exception {
        public InvalidSemesterException(String message) {
            super(message);
        }
    }
    
    public static class InvalidCourseFeesException extends Exception {
        public InvalidCourseFeesException(String message) {
            super(message);
        }
    }
}


