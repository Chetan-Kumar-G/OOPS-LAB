import java.io.*;

public class filehandeling_1 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "Hello, this is a sample text file.\nJava file handling is interesting!";

        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
