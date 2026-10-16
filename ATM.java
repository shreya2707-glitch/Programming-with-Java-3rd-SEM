import java.util.Scanner;

class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int pin;
        double balance = 10000;
        double amount;

        System.out.print("Enter PIN: ");
        pin = sc.nextInt();

        if(pin != correctPin)
        {
            System.out.println("Invalid PIN");
        }
        else
        {
            System.out.print("Enter withdrawal amount: ");
            amount = sc.nextDouble();

            if(amount <= 0)
            {
                System.out.println("Invalid amount");
            }
            else if(amount > balance)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                balance = balance - amount;

                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance = " + balance);
            }
        }
    }
}