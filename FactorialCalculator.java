import java.util.Scanner;
/**
 * Factorial of a number n (written as n!) is:
 * n! = n × (n-1) × (n-2) × ... × 2 × 1
 * Examples:
 * 0! = 1 (special case)
 * 1! = 1
 * 2! = 2 × 1 = 2
 * 3! = 3 × 2 × 1 = 6
 * 4! = 4 × 3 × 2 × 1 = 24
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        // Create Scanner to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Display welcome message
        System.out.println("====== Factorial Calculator ======");
        System.out.println("This program calculates the factorial of a number.");

        // Ask user to enter a number
        System.out.print("\nEnter a non-negative number: ");
        int number = input.nextInt();

        // Check if the number is valid
        if (number < 0) {
            System.out.println("Error: Cannot calculate factorial of a negative number.");
        } else {
            // Calculate factorial using the method
            long result = factorial(number);

            // Display the result
            System.out.println("\nThe factorial of " + number + " is: " + result);

            // Show the calculation steps
            System.out.print("Calculation: ");

            if (number == 0 || number == 1) {
                System.out.println(number + "! = " + result);
            } else {
                System.out.print(number + "! = " + number);

                for (int i = number - 1; i >= 1; i--) {
                    System.out.print(" x " + i);
                }

                System.out.println(" = " + result);
            }
        }

        // Close the scanner
        input.close();
    }

    /*
      Calculate factorial using a simple loop (non-recursive approach)
     */

    public static long factorial(int n) {
        // Start with 1 (not 0, because multiplication by 0 would always give 0)
        long result = 1;

        // Special case for 0! = 1
        if (n == 0) {
            return 1;
        }

        // Multiply: 1 × 2 × 3 × ... × n
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}