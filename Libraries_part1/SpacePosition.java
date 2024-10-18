import java.util.Scanner;
public class SpacePosition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input=sc.nextLine();
        System.out.println("positioin of the space in the given string :- ");
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                System.out.println("Space found in the position : "+i);
            }
        }
        sc.close();
    }
}
