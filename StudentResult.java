
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.*;

class StudentResult {
    String name;
    int rollNo;
    int m1, m2, m3;

    // Calculate total marks
    int calculateTotal() {
        return m1 + m2 + m3;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Determine pass or fail
    String determineResult() {
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Display student result
    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Result: " + determineResult());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentResult s = new StudentResult();

        try {
            System.out.print("Enter student name: ");
            s.name = sc.nextLine();

            System.out.print("Enter roll number: ");
            s.rollNo = sc.nextInt();

            System.out.print("Enter marks in three subjects: ");
            s.m1 = sc.nextInt();
            s.m2 = sc.nextInt();
            s.m3 = sc.nextInt();

            // Check valid marks
            if (s.m1 < 0 || s.m1 > 100 ||
                s.m2 < 0 || s.m2 > 100 ||
                s.m3 < 0 || s.m3 > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }

            s.displayResult();

        } catch (InputMismatchException e) {
            System.out.println("Error: Enter numbers for roll number and marks.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}