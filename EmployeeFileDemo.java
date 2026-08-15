import java.io.*;

public class EmployeeFileDemo {
    public static void main(String[] args) {
        try {
            // Writing employee details to file
            FileWriter writer = new FileWriter("employee.txt");
            writer.write("ID: 181 | Name: Shreya Panda | Dept: CSE | Salary: $75000\n");
            writer.write("ID: 126 | Name: Novera | Dept: CSE | Salary: $65000\n");
            writer.write("ID: 163 | Name: Jenice Sahoo | Dept: CSE | Salary: $80000");
            writer.close();

            System.out.println("Employee details written successfully.\n");

            // Reading employee details from file
            FileReader reader = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("--- Reading Employee Details from File ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}