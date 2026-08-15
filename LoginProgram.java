import java.util.*;

public class LoginProgram
 {

    static void login(String password) throws Exception 
{

        if (!password.equals("admin123")) {
            throw new Exception("Invalid Password");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args)
 {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            login(password);

        } 
        catch (Exception e)
        {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Finally block execution");

        }

        System.out.println("Program ends");
    }
}