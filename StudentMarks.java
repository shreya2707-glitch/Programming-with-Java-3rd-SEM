import java.util.Scanner;

class StudentMarks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if(percentage >= 75)
            System.out.println("Grade = A");
        else if(percentage >= 60)
            System.out.println("Grade = B");
        else if(percentage >= 40)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = F");
    }
}