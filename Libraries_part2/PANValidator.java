//43. Write a program to accept pan no and check whether it is valid or not.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PANValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PAN number: ");
        String panNumber = scanner.nextLine();

        if (isValidPAN(panNumber)) {
            System.out.println("The PAN number is valid.");
        } else {
            System.out.println("The PAN number is invalid.");
        }

        scanner.close();
    }

    public static boolean isValidPAN(String pan) {
        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pan);
        return matcher.matches();
    }
}
