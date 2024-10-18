// Write a program to guess the random number in three attempts. The range is (1 to 25).
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int randomNumber=rd.nextInt(25)+1;
        System.out.println("welcome to the Guess the number game");
        System.out.println("Here we generate the random number between 1 to 25");
        System.out.println("Guess that Random number in 3 attempts");
        int attempts=3;
        boolean guess=false;
        for(int i=1;i<=attempts;i++)
        {
            System.out.println("Attempt "+i+" Enter your guess");
            int userGuess=sc.nextInt();
            if(userGuess==randomNumber)
            {
                System.out.println("Cogratulations Correct Guess in "+i+" attempt");
                guess=true;
                break;
            }
            else if(userGuess<randomNumber)
            {
                System.out.println("Too low, Try again");
            }
            else
            {
                System.out.println("Too high, Try again");
            }
        }
        if(!guess)
        {
            System.out.println("Sorry, your attempts execeded");
            System.out.println("The correct number was : "+randomNumber);
        }
        sc.close();
    }
    
}