import java.sql.*;

public class EmployeeOperations {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            // Insert employee
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employees VALUES (?, ?, ?, ?)"
            );

            ps.setInt(1, 101);
            ps.setString(2, "Amit");
            ps.setString(3, "IT");
            ps.setDouble(4, 35000);

            ps.executeUpdate();
            System.out.println("Employee inserted successfully");

            // Update employee salary
            ps = con.prepareStatement(
                "UPDATE employees SET salary = ? WHERE emp_id = ?"
            );

            ps.setDouble(1, 40000);
            ps.setInt(2, 101);

            ps.executeUpdate();
            System.out.println("Employee updated successfully");

            // Delete employee
            ps = con.prepareStatement(
                "DELETE FROM employees WHERE emp_id = ?"
            );

            ps.setInt(1, 101);

            ps.executeUpdate();
            System.out.println("Employee deleted successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}