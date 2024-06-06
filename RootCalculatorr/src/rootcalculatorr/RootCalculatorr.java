package rootcalculatorr;
import java.util.Scanner;

public class RootCalculatorr {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Calculate the root
        double result = Math.pow(firstNumber, 1.0 / secondNumber);

        // Display the result
        System.out.println("The " + secondNumber + " root of " + firstNumber + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
