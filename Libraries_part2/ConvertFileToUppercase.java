//38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConvertFileToUppercase {
    public static void main(String[] args) throws IOException {
        String filename = "names.txt";
        List<String> lines = Files.readAllLines(Paths.get(filename));
        Files.write(Paths.get(filename), lines.stream().map(String::toUpperCase).toList());
        System.out.println("File content converted to uppercase.");
    }
}

