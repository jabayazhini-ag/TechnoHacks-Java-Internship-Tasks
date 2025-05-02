import java.util.Scanner;

public class ArrayManipulation {

    // Method for Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method for Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Not found
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        // Create array and get elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        bubbleSort(numbers);
        System.out.println("\nSorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Ask user for a number to search
        System.out.print("\n\nEnter a number to search: ");
        scanner.nextLine();
        int key = scanner.nextInt();

        // Search using Linear Search
        int result = linearSearch(numbers, key);
        if (result != -1) {
            System.out.println(key + " found at index " + result + " in the sorted array.");
        } else {
            System.out.println(key + " not found in the array.");
        }

        scanner.close();
    }
}