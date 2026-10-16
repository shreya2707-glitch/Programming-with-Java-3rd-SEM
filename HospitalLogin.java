import java.sql.*;
import java.util.Scanner;

public class HospitalLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            System.out.print("Enter Login ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            String query = "SELECT * FROM hospital_staff WHERE login_id = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");

                if (role.equalsIgnoreCase("doctor")) {
                    System.out.println("Doctor login successful!");
                    System.out.println("Welcome, Doctor.");
                } else if (role.equalsIgnoreCase("nurse")) {
                    System.out.println("Nurse login successful!");
                    System.out.println("Welcome, Nurse.");
                } else {
                    System.out.println("Staff login successful!");
                }
            } else {
                System.out.println("Invalid Login ID or Password!");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}