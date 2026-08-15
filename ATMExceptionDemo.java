import java.io.*;

public class ATMExceptionDemo {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 6000;
        int negativeAmount = -500;

        try {
            // Nested try block to handle invalid negative withdrawal amount
            try {
                if (negativeAmount < 0) {
                    throw new IllegalArgumentException("Invalid Amount: Cannot withdraw negative value");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Nested Catch: " + e.getMessage());
            }

            // Outer logic to handle insufficient funds
            if (withdrawAmount > balance) {
                throw new ArithmeticException("Insufficient Balance for withdrawal");
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        System.out.println("ATM Transaction Completed.");
    }
}