abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.eat();
        obj.sound();
    }
}