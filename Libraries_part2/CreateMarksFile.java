import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateMarksFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (FileWriter writer = new FileWriter("Marks.txt")) {
            while (true) {
                System.out.print("Enter marks (comma separated) or type 'END' to finish: ");
                String marks = scanner.nextLine();
                
                if (marks.equalsIgnoreCase("END")) {
                    break;
                }
                
                writer.write(marks + System.lineSeparator());
            }
            
            System.out.println("Marks have been written to Marks.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
