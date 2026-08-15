import java.io.*;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {

            int arr[] = {10, 20, 30};

            try {

                int result = arr[5];
                System.out.println(result);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Nested Catch: Array Index Out Of Bounds");
            }

            int num = 10 / 0;
            System.out.println(num);

        } catch (ArithmeticException e) {

            System.out.println("Outer Catch: Arithmetic Exception");

        } catch (Exception e) {

            System.out.println("General Exception");
        }

        System.out.println("Program continues.");
    }
}