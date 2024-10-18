//37. Write 20 marks into Marks.data
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteMarksToDataFile {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92, 76, 81, 95, 87, 93, 82, 79, 85, 91, 77, 89, 94, 84, 80, 86};
        
        try (FileOutputStream fos = new FileOutputStream("Marks.data")) {
            for (int mark : marks) {
                fos.write(mark);
            }
            System.out.println("20 marks have been written to Marks.data");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

