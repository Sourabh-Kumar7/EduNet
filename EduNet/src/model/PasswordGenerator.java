/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.SecureRandom;
import java.util.Random;
import model.CustomExceptions.InvalidPasswordException;

/**
 *
 * @author sourabhkumar
 */
public class PasswordGenerator {

    // Define characters to use in the password
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{};:'\"<>,.?/\\|";

    public static String generatePassword(int length) {
        // Create a secure random number generator
        Random random = new SecureRandom();

        // Initialize variables to store characters for each category
        StringBuilder password = new StringBuilder();
        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;

        // Ensure at least one character from each category
        password.append(getRandomChar(LOWERCASE, random));
        password.append(getRandomChar(UPPERCASE, random));
        password.append(getRandomChar(DIGITS, random));
        password.append(getRandomChar(SPECIAL_CHARACTERS, random));

        // Fill the remaining characters randomly
        for (int i = 4; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the characters to make it more random
        return shuffleString(password.toString());
    }

    private static char getRandomChar(String characters, Random random) {
        // Get a random character from the specified characters
        int randomIndex = random.nextInt(characters.length());
        return characters.charAt(randomIndex);
    }

    private static String shuffleString(String input) {
        // Shuffle the characters of the input string
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = i + (int) (Math.random() * (characters.length - i));
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }

    public static void main(String[] args) {
        // Generate a random password with a length of 12 characters
        String password = generatePassword(12);

        // Validate the generated password using your validationUtil class
        try {
            validationUtil.validatePassword(password);
            System.out.println("Generated Password: " + password);
        } catch (InvalidPasswordException e) {
            System.err.println("Generated Password Validation Error: " + e.getMessage());
        }
    }
}
