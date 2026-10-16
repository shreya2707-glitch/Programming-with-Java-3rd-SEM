import java.sql.*;

public class StudentRecords {
    public static void main(String[] args) {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            System.out.println("Database connected successfully!");

            // Create statement
            Statement st = con.createStatement();

            // Execute SELECT query
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            // Display student records
            while (rs.next()) {
                System.out.println("Roll Number: " + rs.getInt("roll_no"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Marks: " + rs.getDouble("marks"));
                System.out.println("----------------------");
            }

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}