import java.sql.*;
import java.util.Scanner;

class StudentDatabase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "Prachi@2007";

        try
        {
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            String sql = "INSERT INTO student VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Student added successfully.");

            System.out.println("\nStudent Records:");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next())
            {
                System.out.println(
                    rs.getInt("roll") + " " +
                    rs.getString("name")
                );
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}