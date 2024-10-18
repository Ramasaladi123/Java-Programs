//25. Write a program to accept names until the END is given and display all the names separated by '-'.
import java.util.Scanner;
public class NameCollector {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder names=new StringBuilder();
        String name;
        System.out.println("Enter the names...Enter END to exit");
        while(true)
        {
            name=sc.nextLine();
            if(name.equalsIgnoreCase("END"))
            {
            break;
            }
            if(names.length()>0)
            {
                names.append("-");
            }
            names.append(name);
        }
        System.out.println("Name : "+names.toString());
    }
}
