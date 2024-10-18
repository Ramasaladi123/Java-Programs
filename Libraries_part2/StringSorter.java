//Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStrings = new ArrayList<>();
        String input;
        String regex = "^[A-Za-z]+\\d+$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Enter strings (type 'end' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            if (pattern.matcher(input).matches()) {
                validStrings.add(input);
            } else {
                System.out.println("Invalid format. Please enter a string with one or more alphabets followed by one or more digits.");
            }
        }

        Collections.sort(validStrings);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Codes.txt"))) {
            for (String str : validStrings) {
                writer.write(str);
                writer.newLine(); 
            }
            System.out.println("Valid strings have been sorted and written to Codes.txt.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
