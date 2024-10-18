import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpaceReducer {
    public static void main(String[] args) {
        String fileName = "names.txt"; 
        try {
            replaceMultipleSpaces(fileName);
            System.out.println("Spaces replaced successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }

    public static void replaceMultipleSpaces(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            String modifiedLine = line.replaceAll("\\s+", " ");
            content.append(modifiedLine).append(System.lineSeparator());
        }

        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(content.toString());
        writer.close();
    }
}
