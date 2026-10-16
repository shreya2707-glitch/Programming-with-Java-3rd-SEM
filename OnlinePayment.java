import java.util.Scanner;

interface Payment
{
    void pay(double amount);
}

class UPI implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Payment of Rs. " + amount + " done through UPI");
    }
}

class Card implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Payment of Rs. " + amount + " done through Card");
    }
}

class OnlinePayment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter payment amount: ");
            double amount = sc.nextDouble();

            if(amount <= 0)
            {
                System.out.println("Invalid amount");
                return;
            }

            System.out.println("1. UPI");
            System.out.println("2. Card");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            Payment p;

            if(choice == 1)
            {
                p = new UPI();
                p.pay(amount);
            }
            else if(choice == 2)
            {
                p = new Card();
                p.pay(amount);
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}