//7. Write a program to accept the number and display the number in reverse order.
import java.util.Scanner;
public class ReverseNumber {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    int temp=num;
    int rev=0,rem;
    int endzero=0;
    while(temp%10==0&&temp!=0)
    {
        endzero++;
        temp=temp/10;
    }
    while(num!=0)
    {
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
    }
        System.out.print("Number in reverse order:");
        while(endzero!=0)
        {
            System.out.print(0);
            endzero--;
        }
        System.out.println(rev);
        sc.close();
  }  
}
