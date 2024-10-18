//5. Write a program to accept five numbers from the user and display the average of numbers.
import java.util.Scanner;
public class AverageOfNUmbers {
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    double average;
    for(int i=1;i<=5;i++)
    {
        System.out.printf("Enter the %d number:",i);
        int num=sc.nextInt();
        sum+=num;
    }
    average=sum/5;
    System.out.println("Average of the given 5 numbers:"+average);
   
   sc.close();
}
}
