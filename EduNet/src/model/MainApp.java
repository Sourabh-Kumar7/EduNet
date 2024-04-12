/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import static model.HashingUtil.hashString;
import static model.validationUtil.validatePassword;
import ui.LoginFrame;

/**
 *
 * @author sourabhkumar
 */
public class MainApp {
    public static void main(String args[]) throws CustomExceptions.InvalidPasswordException{
        initUI();
        
        int m = 50; // Number of normal users to generate
        int n = 30;  // Number of admin users to generate
        int p = 5;
        int q = 5;
        
        generateUsers(m, "Student");
        generateUsers(n, "Professor");
        generateUsers(p, "Admin");
        generateUsers(q, "DegreeAuthority");
        
    };

    private static void initUI() {
        LoginFrame mainFrame = new LoginFrame();
        mainFrame.setVisible(true);
    }
    
    private static void generateUsers(int count, String userType) {
        try {
            for (int i = 0; i < count; i++) {
                User normalUser = DataGenerator.generateUser(userType); // Generate a normal user
            }
        } catch (CustomExceptions.InvalidPasswordException e) {
            System.err.println("Error while auto creating normal user: " + e.getMessage());
        }
    }
}
