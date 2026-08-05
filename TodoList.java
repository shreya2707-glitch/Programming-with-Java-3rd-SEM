import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Store tasks using ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");
            tasks.add(sc.nextLine());
        }

        // Display tasks using StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("To-Do List:\n");

        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(sb);

        sc.close();
    }
}