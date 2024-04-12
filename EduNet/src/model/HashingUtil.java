/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author sourabhkumar
 */

public class HashingUtil {
    public static String hashString(String input) {
        try {
            // Create a SHA-256 MessageDigest instance
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convert the input string to bytes
            byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);

            // Compute the hash
            byte[] hashBytes = digest.digest(inputBytes);

            // Convert the hash to a hexadecimal string
            return Hex.toHexString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String input1 = "This is a sample string to hash.";
        String input2 = "This is another sample string.";

        String hash1 = hashString(input1);
        String hash2 = hashString(input2);
        String hash3 = hashString(input1);

        System.out.println("Original String 1: " + input1);
        System.out.println("Original String 2: " + input2);
        System.out.println("Original String 3: " + input1);
        System.out.println("Hash 1: " + hash1);
        System.out.println("Hash 2: " + hash2);
        System.out.println("Hash 3: " + hash3);

        // Check if the two hash values are equal
        boolean hashesEqual = hash1.equals(hash2);
        System.out.println("Are Hashes Equal? " + hashesEqual);
        
        hashesEqual = hash1.equals(hash1);
        System.out.println("Are Hashes Equal? " + hashesEqual);

    }
}
