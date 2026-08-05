// Program to demonstrate Wrapper Classes in Java
// It shows Autoboxing, Unboxing, String conversion,
// and basic operations using Wrapper objects

public class WrapperClassSymbi {

    public static void main(String[] args) {

        // ---------------- Autoboxing ----------------
        // Converting primitive data types into their corresponding Wrapper objects
        // Java automatically converts int to Integer object
        int num = 100;
        Integer intObj = num;

        // Java automatically converts double to Double object
        double value = 25.57;
        Double doubleObj = value;


        // ---------------- Unboxing ----------------
        // Converting Wrapper objects back into primitive data types
        // Integer object is converted into int value
        int primitiveInt = intObj;

        // Double object is converted into double value
        double primitiveDouble = doubleObj;


        // ---------------- String to Wrapper Conversion ----------------
        // Converting String values into Wrapper class objects
        // valueOf() method converts String into corresponding Wrapper object

        Integer number = Integer.valueOf("200");

        Double decimal = Double.valueOf("45.5");


        // ---------------- Wrapper to String Conversion ----------------
        // Converting Wrapper objects into String values using toString()

        String str1 = intObj.toString();

        String str2 = doubleObj.toString();


        // ---------------- Operations using Wrapper Objects ----------------
        // Wrapper objects can directly participate in arithmetic operations
        // because Java automatically performs unboxing

        int sum = intObj + number;

        double product = doubleObj * decimal;


        // ---------------- Displaying Results ----------------

        // Printing primitive values obtained after unboxing
        System.out.println("Primitive int: " + primitiveInt);

        System.out.println("Primitive double: " + primitiveDouble);


        // Printing Wrapper class objects
        System.out.println("Integer Object: " + intObj);

        System.out.println("Double Object: " + doubleObj);


        // Printing values converted from String
        System.out.println("Converted from String (Integer): " + number);

        System.out.println("Converted from String (Double): " + decimal);


        // Printing Wrapper objects converted into String
        System.out.println("String value of Integer: " + str1);

        System.out.println("String value of Double: " + str2);


        // Printing arithmetic operation results
        System.out.println("Sum: " + sum);

        System.out.println("Product: " + product);
    }
}