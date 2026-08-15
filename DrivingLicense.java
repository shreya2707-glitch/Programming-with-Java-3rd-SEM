import java.io.*;

class NotEligibleException extends Exception {
    NotEligibleException(String message) {
        super(message);
    }
}

public class DrivingLicense {

    static void checkAge(int age) throws NotEligibleException {

        if (age < 18) {
            throw new NotEligibleException(
                "Age must be 18 or above for driving license."
            );
        }

        System.out.println("Eligible for driving license");
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