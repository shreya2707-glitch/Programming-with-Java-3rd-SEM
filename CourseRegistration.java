import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();
                    courses.add(course);
                    System.out.println("Course added.");
                    break;

                case 2:
                    System.out.print("Enter course name to remove: ");
                    String removec = sc.nextLine();

                    if (courses.remove(removec)) {
                        System.out.println("Course removed.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 3:
                    StringBuffer sb = new StringBuffer();
                    sb.append("Registered Courses:\n");

                    if (courses.isEmpty()) {
                        sb.append("No courses registered.\n");
                    } else {
                        for (int i = 0; i < courses.size(); i++) {
                            sb.append((i + 1) + ". " + courses.get(i) + "\n");
                        }
                    }

                    System.out.println(sb);
                    break;

                case 4:
                    System.out.println("Exiting..........");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}