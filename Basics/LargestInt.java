//9. Write a program to create a function that takes a set of integers and returns the largest of integers.
public class LargestInt {
    public static int getLargest(int... num)
    {
        int len,max;
        len=num.length;
        if(len==0)
        {
            System.out.println("Enter atleast one integer.");
            return 0;
        }
        else{
            max=num[0];
            for(int i=1;i<len;i++)
            {
                if(num[i]>max)
                {
                    max=num[i];
                }
            }
            return max;
        }
        
    }
    public static void main(String[] args)
    {
        System.out.println(getLargest(10,30,20));
        System.out.println(getLargest(3,5,1,9));
        System.out.println(getLargest(-1,-2));
    }
}
