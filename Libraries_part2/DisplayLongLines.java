//35. Write a program to display lines that contains more than 5 characters.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayLongLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            
            System.out.println("Lines with more than 5 characters:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                if (line.length() > 5) {
                    System.out.println(line);
                }
            }
            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' was not found.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
