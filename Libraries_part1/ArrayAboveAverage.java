//Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.
import java.util.Random;
public class ArrayAboveAverage {
    public static void main(String[] args)
    {
        Random rd=new Random();
        int[] arr=new int[10];
        int sum=0;
        System.out.print("Array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rd.nextInt(100)+1;
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        double average=(double)sum/arr.length;
        System.out.println("\nAverage of the array elements : "+average);
        System.out.print("Elements which are greater than average of array : ");
        for(int number:arr)
        {
            if(number>average)
            {
                System.out.print(number+" ");
            }
        }

    }
}
