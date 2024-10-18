//Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.
import java.util.Scanner;
public class DisplayStringVertically {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String userInput=sc.nextLine();
        System.out.println("Displaying String vertically");
        for(int i=0;i<userInput.length();i++)
        {
            System.out.println(userInput.charAt(i));
        }
        sc.close();
    }
}
