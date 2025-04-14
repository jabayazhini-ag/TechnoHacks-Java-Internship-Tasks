import java.util.Scanner;

   /*
    Palindromes are words that read the same forward and backward
    Examples: mom, dad, radar, level
   */

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for a word
        System.out.println("Palindrome Checker");
        System.out.println("=================");
        System.out.print("Enter a word: ");

        // Get the input word
        String word = scanner.nextLine();

        // Call our method to check if it's a palindrome
        boolean isPalindrome = checkPalindrome(word);

        // Show the result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome!");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    /*
     Checks if a word is a palindrome
     @param word The word to check
     @return true if the word is a palindrome, false otherwise
    */

    public static boolean checkPalindrome(String word) {
        // Convert to lowercase to ignore case
        String lowerWord = word.toLowerCase();

        // Get the length of the word
        int length = lowerWord.length();

        // Check characters from both ends moving inward
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the beginning and end
            // If any don't match, it's not a palindrome
            if (lowerWord.charAt(i) != lowerWord.charAt(length - 1 - i)) {
                return false;
            }
        }

        // If we get here, all characters matched - it's a palindrome
        return true;
    }
}