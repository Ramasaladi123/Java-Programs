//47. Write a program to display the file which contains the given string in a path.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();
        try {
            displayLinesContainingString(filePath, searchString);
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }

        scanner.close();
    }

    public static void displayLinesContainingString(String filePath, String searchString) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        boolean found = false;

        System.out.println("Lines containing \"" + searchString + "\":");

        while ((line = reader.readLine()) != null) {
            if (line.contains(searchString)) {
                System.out.println(line);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lines found containing the specified string.");
        }

        reader.close();
    }
}
