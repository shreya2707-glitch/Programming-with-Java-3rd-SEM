interface Switchable {
    void turnOn();
}

class Light implements Switchable {

    String room;

    Light(String room) {
        this.room = room;
    }

    public void turnOn() {
        System.out.println(room + " Light is ON");
    }
}

class Fan implements Switchable {

    int speed;

    Fan(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        System.out.println("Fan is ON at Speed " + speed);
    }
}

public class Switchable1 {

    public static void main(String[] args) {

        Switchable s1 = new Light("Living Room");
        Switchable s2 = new Fan(3);

        s1.turnOn();
        s2.turnOn();
    }
}