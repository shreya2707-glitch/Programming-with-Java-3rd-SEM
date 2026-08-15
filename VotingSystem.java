import java.io.*;

class NotEligibleException extends Exception {
    NotEligibleException(String message) {
        super(message);
    }
}

public class VotingSystem {

    static void checkAge(int age) throws NotEligibleException {

        if (age < 18) {
            throw new NotEligibleException(
                "Age must be 18 or above."
            );
        }

        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);

        } catch (NotEligibleException e) {

            System.out.println("This is Exception: " + e.getMessage());
        }

        System.out.println("Program ends");
    }
}