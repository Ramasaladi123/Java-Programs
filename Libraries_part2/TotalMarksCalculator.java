//. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the filename (e.g., Marks.txt): ");
        String filename = scanner.nextLine();
        
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            int lineNumber = 1;
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] marks = line.split(","); 
                
                int totalMarks = 0;
                boolean hasError = false;
                
                for (String mark : marks) {
                    try {
                        totalMarks += Integer.parseInt(mark.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mark found on line " + lineNumber + ": " + mark);
                        hasError = true;
                    }
                }
                
                if (!hasError) {
                    System.out.println("Total marks for line " + lineNumber + ": " + totalMarks);
                } else {
                    System.out.println("Skipping line " + lineNumber + " due to invalid data.");
                }
                
                lineNumber++;
            }
            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' was not found.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}

