package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCproject {
    public static void main(String[] args) {
        try {
            // Load JDBC Driver (example for MySQL, change if needed)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection (update with your DB URL, username, password)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/students", "root", "4874");

            String insertSQL = "REPLACE INTO students (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            Object[][] students = {
                {1, "Vishnu"},
                {2, "Mukka"},
                {3, "Viswa"},
                {4, "Reddy"},
                {5, "Sumanth"},
                {6, "Pavan"},
            };

            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
