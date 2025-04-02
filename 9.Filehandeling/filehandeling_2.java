import java.io.*;

public class filehandeling_2{
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0, wordCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }
            System.out.println("\nTotal Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
