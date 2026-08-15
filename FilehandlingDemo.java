import java.io.*;

public class FilehandlingDemo {

    public static void main(String[] args) {

        try {

            // Writing to file
            FileWriter writer = new FileWriter("panda.txt");
            writer.write("Welcome to PANDA world.\n");
            writer.write("This is created using FileWriter.");
            writer.close();

            System.out.println("Data written successfully.");

            // Reading from file
            FileReader reader = new FileReader("panda.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Contents of file:");

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