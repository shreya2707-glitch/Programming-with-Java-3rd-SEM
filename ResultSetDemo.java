import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = st.executeQuery(
                "SELECT * FROM students"
            );

            // Display all records
            System.out.println("All Student Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course") + " " +
                    rs.getDouble("marks")
                );
            }

            // Move to the first record
            if (rs.first()) {
                System.out.println("\nFirst Student:");
                System.out.println(rs.getString("name"));
            }

            // Move to the last record
            if (rs.last()) {
                System.out.println("\nLast Student:");
                System.out.println(rs.getString("name"));
            }

            // Move to the second record
            if (rs.absolute(2)) {
                System.out.println("\nSecond Student:");
                System.out.println(rs.getString("name"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}