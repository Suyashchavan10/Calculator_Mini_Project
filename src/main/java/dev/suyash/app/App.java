package dev.suyash.app;
import dev.suyash.calculator.Calculator;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        int userChoice;

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Logarithm");
            System.out.println("8. Exponentiation");

            System.out.print("Choose an option: ");
            userChoice = inputScanner.nextInt();

            if (userChoice == 0) {
                System.out.println("Terminating program...");
                break;
            }

            double firstValue, secondValue;

            switch (userChoice) {
                case 1: // Addition
                    System.out.print("Enter two values: ");
                    firstValue = inputScanner.nextDouble();
                    secondValue = inputScanner.nextDouble();
                    System.out.println("Sum: " + calculator.addition(firstValue, secondValue));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter two values: ");
                    firstValue = inputScanner.nextDouble();
                    secondValue = inputScanner.nextDouble();
                    System.out.println("Difference: " + calculator.subtraction(firstValue, secondValue));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter two values: ");
                    firstValue = inputScanner.nextDouble();
                    secondValue = inputScanner.nextDouble();
                    System.out.println("Product: " + calculator.multiplication(firstValue, secondValue));
                    break;

                case 4: // Division
                    System.out.print("Enter two values: ");
                    firstValue = inputScanner.nextDouble();
                    secondValue = inputScanner.nextDouble();
                    try {
                        System.out.println("Quotient: " + calculator.division(firstValue, secondValue));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5: // Square Root
                    System.out.print("Enter a value: ");
                    firstValue = inputScanner.nextDouble();
                    try {
                        System.out.println("Square Root: " + calculator.squareRoot(firstValue));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6: // Factorial
                    System.out.print("Enter a positive integer: ");
                    int integerValue = inputScanner.nextInt();
                    try {
                        System.out.println("Factorial: " + calculator.factorial(integerValue));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7: // Natural Logarithm
                    System.out.print("Enter a value: ");
                    firstValue = inputScanner.nextDouble();
                    try {
                        System.out.println("Natural Logarithm: " + calculator.naturalLog(firstValue));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 8: // Exponentiation
                    System.out.print("Enter the base and exponent: ");
                    firstValue = inputScanner.nextDouble();
                    secondValue = inputScanner.nextDouble();
                    System.out.println("Result: " + calculator.power(firstValue, secondValue));
                    break;

                default:
                    System.out.println("Invalid option. Please try valid option.");
                    break;
            }
        }

        inputScanner.close();
    }
}
