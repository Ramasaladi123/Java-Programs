//32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.
import java.util.Scanner;
public class PositiveNumberSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        System.out.println("Enter the numbers ( type O to exit) :");
        while(true)
        {
            String num=sc.nextLine();
            if(num.equalsIgnoreCase("o"))
            {
                break;
            }
            try{
                double n=Double.parseDouble(num);
                if(n>=0)
                {
                    sum+=n;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
        sc.close();
    }
}
