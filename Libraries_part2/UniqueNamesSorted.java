//Write a program to take names from names.txt & display unique names in sorted order
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesSorted {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueNames = new TreeSet<>(Files.readAllLines(Paths.get("names.txt"))); 
        uniqueNames.forEach(System.out::println);
    }
}

