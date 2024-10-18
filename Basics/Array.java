//8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.
import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the 5 elements:");
        for(int  i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements in reverse order:");
        for(int i=4;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
