public class SimpleCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Welcome to Simple Calculator");

        while (continueCalculating) {
            System.out.println("\nAvailable operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("\nChoose an operation (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                continueCalculating = false;
                System.out.println("Thank you for using Simple Calculator. Goodbye!");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char response = scanner.next().charAt(0);
            if (response != 'y' && response != 'Y') {
                continueCalculating = false;
                System.out.println("Thank you for using Simple Calculator. Goodbye!");
            }
        }

        scanner.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        return a / b;
    }
}