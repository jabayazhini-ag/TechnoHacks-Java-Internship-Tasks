import java.util.Scanner;

public class ExceptionHandling {

    // Method that could throw an exception (division)
    public static int divideNumbers(int a, int b) {
        return a / b;  // Might throw ArithmeticException if b is 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from user
            System.out.print("Enter the numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int num2 = scanner.nextInt();

            // Try to divide the numbers
            int result = divideNumbers(num1, num2);

            // If no exception, print result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block will execute if there's division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block always runs
            System.out.println("Thank you for using the program.");
        }

        scanner.close();
    }
}
