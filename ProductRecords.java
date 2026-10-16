import java.sql.*;

public class ProductRecords {
    public static void main(String[] args) {
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "Prachi@2007"
            );

            System.out.println("Database connected successfully!");

            // Execute SELECT query
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM products"
            );

            // Display product records
            while (rs.next()) {
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Product Name: " + rs.getString("product_name"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("----------------------");
            }

            // Close connection
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}