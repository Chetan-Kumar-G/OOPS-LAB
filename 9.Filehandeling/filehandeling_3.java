import java.io.*;

public class filehandeling_3{
    public static void main(String[] args) {
        String fileName = "output.txt";

        
        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.newLine();
            bufferedWriter.write("Appending new data to the file.");
            System.out.println("\nData appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending data.");
            e.printStackTrace();
        }
    }
}
