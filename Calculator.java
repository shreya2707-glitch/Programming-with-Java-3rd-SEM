// Class Calculator demonstrates static variables, constructors,
// method overloading, and static methods
class Calculator {

    // Static variable shared by all objects of the class
    // It stores the number of Calculator objects created
    static int count = 0;

    // Constructor of Calculator class
    // It is called automatically whenever an object is created
    Calculator() {
        count++; // Increment object count every time constructor is called
    }

    // Method overloading:
    // Same method name "add" with different parameters

    // Adds two integer numbers
    int add(int a, int b) {
        return a + b;
    }

    // Adds two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // Adds three integer numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Static method
    // It can access only static variables directly
    static void displayCount() {
        System.out.println("Objects Created: " + count);
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating two objects of Calculator class
        // Constructor will be called twice and count becomes 2
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        // Calling overloaded add() method with two integer arguments
        System.out.println("Addition of two integers: " + c1.add(10, 20));

        // Calling overloaded add() method with two double arguments
        System.out.println("Addition of two doubles: " + c1.add(10.5, 20.5));

        // Calling overloaded add() method with three integer arguments
        System.out.println("Addition of three integers: " + c1.add(10, 20, 30));

        // Calling static method using class name
        Calculator.displayCount();
    }
}