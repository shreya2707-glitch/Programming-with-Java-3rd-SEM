import java.sql.*;

public class StudentData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            System.out.println(
                "Student database connected successfully!"
            );

            Statement st = con.createStatement();
            System.out.println("Statement created successfully!");

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}