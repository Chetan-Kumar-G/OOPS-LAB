import java.util.Scanner;

class ArrayHandler {
    private int[] numbers = {10, 20, 30, 40, 50};

    public void printValueAtIndex(int index) {
        System.out.println("Value at index " + index + ": " + numbers[index]);
    }
}

public class errorhandeling_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayHandler arrayHandler = new ArrayHandler();

        System.out.print("Enter an index (0-4): ");
        int index = scanner.nextInt();

        try {
            arrayHandler.printValueAtIndex(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index entered!");
        }

        scanner.close();
    }
}
