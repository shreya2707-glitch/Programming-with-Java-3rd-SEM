import java.io.*;

class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {

    static void checkmarks(int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Marks should be between 0 and 100."
            );
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        try {
            checkmarks(98);
        }
        catch (InvalidMarksException e) {
            System.out.println("This is Exception: " + e.getMessage());
        }

        System.out.println("Program ends");
    }
}