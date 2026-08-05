abstract class Payment {

    abstract void makePayment(double amount);

    void paymentInfo() {
        System.out.println("Payment Processing");
    }
}

class CreditCard extends Payment {

    void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

class UPI extends Payment {

    void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        p1.paymentInfo();
        p1.makePayment(5000);

        System.out.println();

        Payment p2 = new UPI();
        p2.paymentInfo();
        p2.makePayment(1500);
    }
}