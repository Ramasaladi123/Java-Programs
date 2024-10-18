//6. Write a program to accept the number and display the largest factor other than the number.
import java.util.Scanner;
public class LargestFactor {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int Lfactor=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                Lfactor=i;
            }
        }
        System.out.println("Largest factor other than the number is:"+Lfactor);
        sc.close();
    }   
}
