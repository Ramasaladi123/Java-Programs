//4. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                for (char ch : line.toCharArray()) {
                    if (Character.isUpperCase(ch)) {
                        uppercaseCount++;
                    } else if (Character.isLowerCase(ch)) {
                        lowercaseCount++;
                    } else if (Character.isDigit(ch)) {
                        digitCount++;
                    }
                }
            }
            
            fileScanner.close();
            
            System.out.println("Uppercase letters: " + uppercaseCount);
            System.out.println("Lowercase letters: " + lowercaseCount);
            System.out.println("Digits: " + digitCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' was not found.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}

