package xyz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentManagementSystem extends Application {

    private TextField nameField;
    private TextField rollNumberField;
    private TextField courseField;
    private TextField semesterField;
    private TextField emailField;
    private TextField phoneField;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Management System");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        nameField = new TextField();
        rollNumberField = new TextField();
        courseField = new TextField();
        semesterField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();

        Button insertButton = new Button("Insert");
        insertButton.setOnAction(e -> insertStudent());

        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(new Label("Roll Number:"), 0, 1);
        grid.add(rollNumberField, 1, 1);
        grid.add(new Label("Course:"), 0, 2);
        grid.add(courseField, 1, 2);
        grid.add(new Label("Semester:"), 0, 3);
        grid.add(semesterField, 1, 3);
        grid.add(new Label("Email:"), 0, 4);
        grid.add(emailField, 1, 4);
        grid.add(new Label("Phone:"), 0, 5);
        grid.add(phoneField, 1, 5);
        grid.add(insertButton, 1, 6);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void insertStudent() {
        String name = nameField.getText();
        String rollNumber = rollNumberField.getText();
        String course = courseField.getText();
        String semester = semesterField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();

        String url = "jdbc:mysql://localhost:3306/studentdb"; // Make sure this DB exists
        String user = "root";
        String password = "4874";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO student1 (name, roll_number, course, semester, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, rollNumber);
            pstmt.setString(3, course);
            pstmt.setString(4, semester);
            pstmt.setString(5, email);
            pstmt.setString(6, phone);
            pstmt.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "✅ Student inserted successfully!");
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, "❌ Error inserting student!\n" + e.getMessage());
            alert.showAndWait(); // 💡 This line was missing
        }
    }
}
