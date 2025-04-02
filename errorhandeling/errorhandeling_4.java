import java.io.*;

class FileHandler {
    public void readFile(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

public class errorhandeling_4{
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String filename = "sample.txt"; 

        try {
            fileHandler.readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: Issue reading the file!");
        }
    }
}
