//. Write a program to take a String and invert the case of characters
import java.util.Scanner;
public class InvertCase {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input=sc.nextLine();
        StringBuilder output=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(Character.isUpperCase(c))
            {
                output.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c))
            {
                output.append(Character.toUpperCase(c));
            }
            else
            {
                output.append(c);
            }
        }
        System.out.println("The inverted String is : "+output);
        sc.close();
    }
}
