import java.util.Scanner;
public class MarksTotal {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks separeted by commas : ");
        String inputMarks=sc.nextLine();
        String[] mark=inputMarks.split(",");
        int total=0;
        for(String s:mark)
        {
            total+=Integer.parseInt(s.trim());
        }
        System.out.println("Total Marks : "+total);
        sc.close();
    }
}
