final class FinalClass {

    final int x = 100;

    final void display() {
        System.out.println("Final Variable x = " + x);
    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        FinalClass obj = new FinalClass();

        obj.display();

        // obj.x = 200; // Error: Cannot assign value to final variable
    }
}