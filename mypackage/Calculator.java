package mypackage;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int mul(int a, int b) {
        return a * b;
    }

    // Division
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return a / b;
    }

    // Modulus
    public int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return a % b;
    }

    // Square
    public int square(int a) {
        return a * a;
    }

    // Cube
    public int cube(int a) {
        return a * a * a;
    }
}