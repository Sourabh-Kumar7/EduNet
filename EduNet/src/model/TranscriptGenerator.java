package model;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;

public class TranscriptGenerator {

    public static void generateTranscript(User u, StudentCourseProgress studentProgress) {
        String studentName = u.getName();
        int studentId = u.getId();
        String pdfPath = "data/transcripts/student_" + studentId + ".pdf";

        try {
            File existingFile = new File(pdfPath);
            if (existingFile.exists()) {
                if (!existingFile.delete()) {
                    // Handle the case where the file couldn't be deleted, if needed
                    System.err.println("Warning: Existing file could not be deleted.");
                }
            }
            
            PDDocument document = new PDDocument();
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page, AppendMode.APPEND, true)) {
                // Set font
                PDType0Font customFont = PDType0Font.load(document, new File("resources/fonts/lato/Lato-Light.ttf"));
                contentStream.setFont(customFont, 12);

                // Add transcript heading
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 750);
                contentStream.setFont(customFont, 18); // Make the heading text bold
                contentStream.showText("Transcript");
                contentStream.endText();

                // Load a default image based on gender if no picture path is provided
                String picPath = u.getPicPath();
                PDImageXObject imageXObject = null;

                if (picPath == null || picPath.isEmpty()) {
                    picPath = switch (u.getGender()) {
                        case "Female" -> "data/images/no_pic_female.jpeg";
                        case "Male" -> "data/images/no_pic_male.jpeg";
                        default -> "data/images/no_pic.jpeg";
                    };

                    // Load the image as a PDImageXObject
                    imageXObject = PDImageXObject.createFromFile(picPath, document);
                    // Add the image to the PDF
                    contentStream.drawImage(imageXObject, 400, 700, 100, 100);
                }

                // Add student information
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 600);
                contentStream.setFont(customFont, 14); // Reset font size
                contentStream.showText("Student ID: " + studentId);
                contentStream.newLineAtOffset(200, 0);
                contentStream.showText("Student Name: " + studentName);
                contentStream.endText();

                // Add course details
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 580);
                contentStream.showText("Completed Courses Details:");
                contentStream.newLineAtOffset(0, -20);

                // Add course details for completed courses
                for (Map.Entry<Integer, CourseProgress> entry : studentProgress.getCourseProgressMap().entrySet()) {
                    if (entry.getValue().isCompleted()) {
                        int courseId = entry.getKey();
                        Course course = DataManager.courseMap.get(courseId);
                        if (course != null) {
                            contentStream.showText("Course Name: " + course.getCourseName());
                            contentStream.newLineAtOffset(0, -20);
                            contentStream.showText("Instructor: " + getProfessorName(course.getInstructorID()));
                            contentStream.newLineAtOffset(0, -20);
                            contentStream.showText("Description: " + course.getDescription());
                            contentStream.newLineAtOffset(0, -20);
                            contentStream.showText("Semester: " + course.getSemester() + " " + course.getYear());
                            contentStream.newLineAtOffset(0, -20);
                            contentStream.showText("Grade: A");
                            contentStream.newLineAtOffset(0, -20);
                        }
                    }
                }
                contentStream.endText();
            }

            // Save the document
            document.save(pdfPath);

            // Close the document
            document.close();

            // Show a success message to the user
            JOptionPane.showMessageDialog(null, "Transcript generated and saved at: " + pdfPath);
        } catch (IOException e) {
            e.printStackTrace();
            // Show an error message to the user
            JOptionPane.showMessageDialog(null, "Error generating transcript.");
        }
    }


    private static String getProfessorName(int professorId) {
        // Define a function to get the professor's name from their ID
        return "Professor Name"; // Replace with your logic
    }

    public static void main(String[] args) {
        // You can test the transcript generation here
        User user = new User("sourabh", new Date(), "Male", "sourabh@express.com", "1234567890", "qwertyuiop", true, "Student");
        StudentCourseProgress studentProgress = new StudentCourseProgress(1);
        studentProgress.setCourseProgress(1, new CourseProgress(100.0));
        studentProgress.setCourseProgress(2, new CourseProgress(100.0));

        generateTranscript(user, studentProgress);
    }
}
