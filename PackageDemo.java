import mypackage.Calculator;

public class PackageDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition = " + c.add(65, 5));
        System.out.println("Subtraction = " + c.sub(68, 5));
        System.out.println("Multiplication = " + c.mul(56, 5));
        System.out.println("Division = " + c.div(90, 5));
        System.out.println("Modulus = " + c.mod(10, 3));
        System.out.println("Square = " + c.square(6));
        System.out.println("Cube = " + c.cube(4));
    }
}