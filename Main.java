public class Main {

    // method to calculate square of a number
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        //variables 
        String name = "Shreya";
        int age = 19;
        double salary = 55000.75;

        int number = 5; // number whose square we want
        int result = square(number);

        // displaying all values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Number: " + number);
        System.out.println("Square Result: " + result);
    }
}