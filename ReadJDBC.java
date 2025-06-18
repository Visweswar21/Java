package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadJDBC {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/Student1"; // Use your actual DB
        String username = "root";
        String password = "4874";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create statement
            Statement statement = connection.createStatement();

            // Execute SELECT query
            String sql = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process result set
            System.out.println("Student Records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String roll = resultSet.getString("roll_number");
                String course = resultSet.getString("course");
                String semester = resultSet.getString("semester");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                System.out.println("ID: " + id + ", Name: " + name + ", Roll: " + roll +
                        ", Course: " + course + ", Semester: " + semester +
                        ", Email: " + email + ", Phone: " + phone);
            }

            // Close connections
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace(); // Don’t leave catch block empty!
        }
    }
}
