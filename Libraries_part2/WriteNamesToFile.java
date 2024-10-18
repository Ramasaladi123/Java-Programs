// Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNamesToFile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try (FileWriter writer = new FileWriter("names.txt")) {
            while (true) {
                System.out.print("Enter a name (type 'END' to stop): ");
                String name = sc.nextLine();
                
                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                
                writer.write(name + System.lineSeparator());
            }
            
            System.out.println("Names have been written to names.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        sc.close();
    }
}
