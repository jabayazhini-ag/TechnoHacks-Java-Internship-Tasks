import java.util.Scanner;

/**
 * A simple program to generate Fibonacci sequence up to a specified limit
 * Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * where each number is the sum of the two preceding ones
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Fibonacci Sequence Generator!");
        System.out.println("This program will show all Fibonacci numbers up to your chosen limit.");

        // Get the upper limit from the user
        System.out.print("\nPlease enter an upper limit: ");
        int limit = input.nextInt();

        // Handle negative inputs
        if (limit < 0) {
            System.out.println("Please enter a positive number next time.");
            input.close();
            return; // Exit the program
        }

        // Display the Fibonacci sequence
        System.out.println("\nFibonacci sequence up to " + limit + ":");
        printFibonacciSequence(limit);

        // Close the scanner to prevent resource leak
        input.close();
    }

    /**
     * Prints all Fibonacci numbers that are less than or equal to the given limit
     */
    public static void printFibonacciSequence(int limit) {
        // First two numbers of Fibonacci sequence
        int firstNumber = 0;
        int secondNumber = 1;

        // Handle the case when limit is 0
        if (limit >= 0) {
            System.out.print(firstNumber);
        }

        // Handle the case when limit is 1 or greater
        if (limit >= 1) {
            System.out.print(", " + secondNumber);
        }

        // Calculate and print the rest of the sequence up to the limit
        int nextNumber = firstNumber + secondNumber;  // nextNumber = 0 + 1 = 1

        while (nextNumber <= limit) {
            System.out.print(", " + nextNumber);

            // Shift the numbers to calculate the next one
            firstNumber = secondNumber;     // Move secondNumber to firstNumber
            secondNumber = nextNumber;      // Move nextNumber to secondNumber
            nextNumber = firstNumber + secondNumber;  // Calculate new nextNumber
        }

        System.out.println(); // Print a new line at the end
    }
}