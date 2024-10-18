//Write a program to accept starting_date and ending_date in DD-MM-YYYY format and display no of days between those two dates.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class DateDifference {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter the Start date : ");
        String startDateInput=sc.nextLine();
        System.out.println("Enter the end data : ");
        String endDateInput=sc.nextLine();
        LocalDate startDate=LocalDate.parse(startDateInput,formatter);
        LocalDate endDate=LocalDate.parse(endDateInput,formatter);
        long diff=ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println("Number of days difference between give dates : "+diff);
        sc.close();
    }
}
