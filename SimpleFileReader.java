import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 * A simple program that reads and displays the contents of a text file
 */
public class SimpleFileReader {
    public static void main(String[] args) {
        // The name of the file to read
        // String fileName = "sample.txt";
        String fileName = "C:\\Users\\USER\\OneDrive\\IntelliJ\\TechnoHacksJavaInternshipTasks\\src\\sample.txt";

        System.out.println("=== Simple File Reader ===");

        // First, let's check if the file exists
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Error: The file '" + fileName + "' does not exist.");
            System.out.println("Please create a file named '" + fileName + "' in the same folder as this program.");
            return; // Exit the program
        }

        System.out.println("Reading from file: " + fileName);
        System.out.println("\n=== File Contents ===");

        try {
            // Create a FileReader connected to the file
            FileReader fileReader = new FileReader(fileName);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // A variable to hold each line from the file
            String line;

            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }

            // Close the reader when done
            bufferedReader.close();

            System.out.println("\n=== End of File ===");

        } catch (IOException e) {
            // If anything goes wrong, tell the user
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}