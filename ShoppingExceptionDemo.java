import java.io.*;

public class ShoppingExceptionDemo {
    public static void main(String[] args) {
        String productName = "Wireless Headphones";
        double price = 1499.00;
        int quantity = 0; // Invalid quantity (less than or equal to 0)

        try {
            // Nested try block to handle invalid quantity error
            try {
                if (quantity <= 0) {
                    throw new IllegalArgumentException("Invalid Quantity: Quantity must be greater than zero.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Nested Catch: " + e.getMessage());
            }

            // Calculation check for total order price
            if (quantity <= 0) {
                throw new ArithmeticException("Cannot compute total bill for an invalid quantity.");
            }

            double total = price * quantity;
            System.out.println("Product: " + productName);
            System.out.println("Total Amount: Rs. " + total);

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        System.out.println("Shopping Process Completed.");
    }
}