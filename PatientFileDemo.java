import java.io.*;

public class PatientFileDemo {
    public static void main(String[] args) {
        try {
            // Writing patient details to file
            FileWriter writer = new FileWriter("patient.txt");
            writer.write("ID: 201 | Name: Rajesh  | Age: 34 | Diagnosis: Acute Bronchitis\n");
            writer.write("ID: 202 | Name: Priya     | Age: 52 | Diagnosis: Hypertension\n");
            writer.write("ID: 203 | Name: Amit     | Age: 28 | Diagnosis: Type 1 Diabetes");
            writer.close();

            System.out.println("Patient details written successfully.\n");

            // Reading patient details from file
            FileReader reader = new FileReader("patient.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("--- Reading Patient Details from File ---");

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