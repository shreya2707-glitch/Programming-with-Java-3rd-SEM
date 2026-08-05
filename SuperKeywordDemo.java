class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent Class Constructor");
    }

    void display() {
        System.out.println("This is Parent Class Method");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super();   // Calls Parent Constructor
        System.out.println("Child Class Constructor");
    }

    void show() {
        System.out.println("Child Variable x = " + x);
        System.out.println("Parent Variable x = " + super.x);

        super.display();   // Calls Parent Method
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();

    }
}