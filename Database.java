public class Database {
    public static void main(String[] args)  throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cc= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
        System.out.println("Connection established successfully!");
        cc.close();

    }