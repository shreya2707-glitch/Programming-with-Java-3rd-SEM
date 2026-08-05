class BankAccount {

    final int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount b = new BankAccount(1001, "Shreya Panda", 50000);

        b.display();

        // b.accountNumber = 2002; // Error: Cannot assign a value to final variable
    }
}