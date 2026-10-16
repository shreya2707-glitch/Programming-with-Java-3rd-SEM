
import java.sql.*;

public class StudentOperations {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            Statement st = con.createStatement();

            // INSERT a student
            int a = st.executeUpdate(
                "INSERT INTO students VALUES (6, 'Karan', 'CSE', 89.5)"
            );
            System.out.println("Student inserted: " + a);

            // UPDATE student marks
            int b = st.executeUpdate(
                "UPDATE students SET marks = 95 WHERE roll_no = 6"
            );
            System.out.println("Student updated: " + b);

            // DELETE a student
            int c = st.executeUpdate(
                "DELETE FROM students WHERE roll_no = 6"
            );
            System.out.println("Student deleted: " + c);

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}