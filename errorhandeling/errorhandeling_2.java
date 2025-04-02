import java.util.Scanner;

class Calculator {
    public double divide(int num1, int num2) {
        return num1 / num2;
    }
}

public class errorhandeling_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Calculator calc = new Calculator();

        try {
            double result = calc.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        scanner.close();
    }
}
