//Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in the order they appear.
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesFromFiles {
    public static void main(String[] args) {
        createFiles();
        
        try {
            Set<String> uniqueNames = new LinkedHashSet<>();
            List<String> names1 = Files.readAllLines(Paths.get("names1.txt"));
            List<String> names2 = Files.readAllLines(Paths.get("names2.txt"));
            uniqueNames.addAll(names1);
            uniqueNames.addAll(names2);

            System.out.println("Unique names from both files:");
            uniqueNames.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the files.");
            e.printStackTrace();
        }
    }

    private static void createFiles() {
        String[] names1 = {"A", "B", "C", "D", "E"};
        String[] names2 = {"C", "F", "A", "G", "H"};

        try {
        
            try (FileWriter writer = new FileWriter("names1.txt")) {
                for (String name : names1) {
                    writer.write(name + System.lineSeparator());
                }
            }

        
            try (FileWriter writer = new FileWriter("names2.txt")) {
                for (String name : names2) {
                    writer.write(name + System.lineSeparator());
                }
            }

            System.out.println("Files names1.txt and names2.txt created with sample names.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the files.");
            e.printStackTrace();
        }
    }
}

