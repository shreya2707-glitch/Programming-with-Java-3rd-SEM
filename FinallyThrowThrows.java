import java.io.*;

public class FinallyThrowThrows {

    static void checkage(int age) throws IOException {

        if (age < 18) {
            throw new IOException("Age must be 18 or above.");
        }

        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

        try {

            checkage(8);

        } catch (IOException e) {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Finally block execution");
        }

        System.out.println("Program ends");
    }
}