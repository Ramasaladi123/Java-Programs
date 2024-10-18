//29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.
import java.util.Scanner;
public class FaultTolerantSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        double total=0.0;
        System.out.println("Enter five numeric numbers : ");
        while(count<5)
        {
            System.out.print("Enter number "+(count+1)+" : ");
            String input=sc.nextLine();
            try{
                double number=Double.parseDouble(input);
                total+=number;
                count++;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input, please enter the valid input");
            }
        }
        System.out.println("Total sum of the numbers : "+total);
        sc.close();
    }
}
