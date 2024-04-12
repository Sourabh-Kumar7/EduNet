/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.CustomExceptions.InvalidDateOfBirthException;
import model.CustomExceptions.InvalidEmailException;
import model.CustomExceptions.InvalidNameException;
import model.CustomExceptions.InvalidPhoneNumberException;
import model.DataManager;
import model.User;
import model.validationUtil;

/**
 *
 * @author sourabhkumar
 */
public class ViewUserDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUserDetailJPanel
     */

    User u;
    Image selectedImage = null;
    public ViewUserDetailJPanel(User u) {
        this.u = u;
        initComponents();
        loadUserData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblUsrType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtID = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextPane();
        btnSelectPicture = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPhone = new javax.swing.JTextPane();
        lblDOB = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUserType = new javax.swing.JTextPane();
        lblName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("User Details");

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone No.");

        lblUsrType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsrType.setText("User Type");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("User ID");

        txtID.setEditable(false);
        jScrollPane6.setViewportView(txtID);

        jScrollPane3.setViewportView(txtName);

        btnSelectPicture.setText("Select Picture");
        btnSelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPictureActionPerformed(evt);
            }
        });

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender");

        jScrollPane5.setViewportView(txtPhone);

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDOB.setText("DOB");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        txtUserType.setEditable(false);
        jScrollPane2.setViewportView(txtUserType);

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txtEmail);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone)
                            .addComponent(lblEmail)
                            .addComponent(lblDOB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnUpdate)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUsrType)
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(76, 76, 76)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectPicture)
                            .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, lblDOB, lblEmail, lblGender, lblName, lblPhone, lblUsrType});
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectPicture))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsrType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGender))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(btnUpdate)
                .addGap(56, 56, 56))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxGender, jDateChooserDOB, jLabel5, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6, lblDOB, lblEmail, lblGender, lblName, lblPhone, lblUsrType});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPictureActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null); // Show the file chooser dialog
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Load and display the selected picture in the JLabel
            lblPicture.setPreferredSize(new Dimension(300, 300));
            try {
                //                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                int labelWidth = 125;
                int labelHeight = 68;

                // Load and display the selected picture in the JLabel
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                Image image = imageIcon.getImage();

                // Calculate the scaling factors to fit the image within the label size
                double scaleX = (double) labelWidth / image.getWidth(null);
                double scaleY = (double) labelHeight / image.getHeight(null);

                // Use the scaling factors to create a scaled image
                Image scaledImage = image.getScaledInstance((int) (image.getWidth(null) * scaleX), (int) (image.getHeight(null) * scaleY), Image.SCALE_SMOOTH);
                //                person.setImage(scaledImage);
                // Create a new ImageIcon from the scaled image
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                lblPicture.setIcon(scaledImageIcon);
                lblPicture.revalidate();
                lblPicture.repaint();
                // Set the selectedImage to the scaledImage
                selectedImage = scaledImage;
            } catch (Exception ex) {
                ex.printStackTrace();
                // Handle the exception, e.g., display an error message
            }
        }
    }//GEN-LAST:event_btnSelectPictureActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            // Get the updated values from the form fields
            String newName = txtName.getText().trim();
            String newEmail = txtEmail.getText().trim();
            String newPhone = txtPhone.getText().trim();
            Date newDob = jDateChooserDOB.getDate();
            String newGender = jComboBoxGender.getSelectedItem().toString();

            // Validate the updated fields
            validationUtil.validateName(newName);
            validationUtil.validateEmail(newEmail);
            validationUtil.validatePhoneNumber(newPhone);
            validationUtil.validateDateOfBirth(newDob);

            // Check for duplicate email
            if (!newEmail.equals(u.getEmail())) {
                if (DataManager.emailUserMap.containsKey(newEmail)) {
                    throw new InvalidEmailException("Email already in use by another user.");
                }
                // Remove the previous email entry
                DataManager.emailUserMap.remove(u.getEmail());
            }

            // Update the User object with the new data
            u.setName(newName);
            u.setEmail(newEmail);
            u.setPhoneNum(newPhone);
            u.setDob(newDob);
            u.setGender(newGender);

            if (selectedImage != null) {
                // Get the person's ID
                String userId = Integer.toString(u.getId());
                String imagePath = "images/" + u.getUserType() + "_" + userId + ".jpg";
                File imageFile = new File(imagePath);

                // Convert the selected image to a BufferedImage
                BufferedImage bufferedImage = new BufferedImage(selectedImage.getWidth(null),
                    selectedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = bufferedImage.createGraphics();
                g2.drawImage(selectedImage, 0, 0, null);
                g2.dispose();

                try {
                    ImageIO.write(bufferedImage, "jpg", imageFile);
                    u.setPicPath(imagePath);
                } catch (IOException e) {
                    System.err.println("Failed to add picture to user. Error: " + e.getMessage());
                }
            }

            // Update the emailUserMap with the new email
            DataManager.emailUserMap.put(newEmail, u);
            loadUserData();
            JOptionPane.showMessageDialog(this, "User detail updated successfully.");

            // Display a success message or perform any other necessary actions

        } catch (InvalidNameException | InvalidEmailException | InvalidPhoneNumberException | InvalidDateOfBirthException ex) {
            // Handle validation errors, e.g., show an error message
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed



    
    private void loadUserData() {
        txtName.setText(u.getName()); // Set user's name
        txtEmail.setText(u.getEmail()); // Set user's email
        txtPhone.setText(u.getPhoneNum()); // Set user's phone number
        txtID.setText(Integer.toString(u.getId())); // Set user's ID (assuming txtID is a JTextField)

        // Set user's gender
        String gender = u.getGender();

        if (null == gender) {
            jComboBoxGender.setSelectedItem("Other");
        } else switch (gender) {
            case "Male" -> jComboBoxGender.setSelectedItem("Male");
            case "Female" -> jComboBoxGender.setSelectedItem("Female");
            default -> jComboBoxGender.setSelectedItem("Other");
        }

        // Set user's date of birth
        jDateChooserDOB.setDate(u.getDob());

        // Set user type
        txtUserType.setText(u.getUserType());

        // You can also load and display the user's profile picture here
        // Assuming lblPicture is a JLabel for displaying the picture
        lblPicture.setPreferredSize(new Dimension(125, 68));
        displayProfilePic();
    }

    private void displayProfilePic() {
        ImageIcon imageIcon;
        String picPath = u.getPicPath();

        if (picPath != null && !picPath.isEmpty()) {
            // Load the provided picture
            try {
                imageIcon = new ImageIcon(picPath);
            } catch (Exception ex) {
                imageIcon = null; // Handle image loading error
            }
        } else {
            if (u.getGender() == null) {
                imageIcon = new ImageIcon("data/images/no_pic.jpeg");
            } else             // Load a default image based on gender
                imageIcon = switch (u.getGender()) {
                case "Female" -> new ImageIcon("data/images/no_pic_female.jpeg");
                case "Male" -> new ImageIcon("data/images/no_pic_male.jpeg");
                default -> new ImageIcon("data/images/no_pic.jpeg");
            };
        }
        
        if (imageIcon != null) {
            Image image = imageIcon.getImage();
            int labelWidth = lblPicture.getPreferredSize().width; // Use the preferred size
            int labelHeight = lblPicture.getPreferredSize().height; // Use the preferred size
            double scaleX = (double) labelWidth / image.getWidth(null);
            double scaleY = (double) labelHeight / image.getHeight(null);
            Image scaledImage = image.getScaledInstance((int) (image.getWidth(null) * scaleX), (int) (image.getHeight(null) * scaleY), Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
            lblPicture.setIcon(scaledImageIcon);
        } else {
            lblPicture.setIcon(null);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectPicture;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsrType;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtID;
    private javax.swing.JTextPane txtName;
    private javax.swing.JTextPane txtPhone;
    private javax.swing.JTextPane txtUserType;
    // End of variables declaration//GEN-END:variables
}
