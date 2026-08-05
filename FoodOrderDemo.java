abstract class FoodOrder {

    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {

        double gst = amount * 0.18;
        double total = amount + gst;

        System.out.println("Dine-In Bill");
        System.out.println("Food Amount : " + amount);
        System.out.println("GST : " + gst);
        System.out.println("Total Bill : " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {

        double packing = 30;
        double total = amount + packing;

        System.out.println("Take Away Bill");
        System.out.println("Food Amount : " + amount);
        System.out.println("Packing Charge : " + packing);
        System.out.println("Total Bill : " + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder d = new DineInOrder(1000);
        d.calculateBill();

        System.out.println();

        FoodOrder t = new TakeAwayOrder(1000);
        t.calculateBill();
    }
}