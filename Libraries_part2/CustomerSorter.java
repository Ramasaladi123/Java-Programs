//Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerSorter {
    public static void main(String[] args) {
        String filePath = "customers.txt"; 
        List<Customer> customers = new ArrayList<>();
        String regex = "^([A-Za-z]+)\\s+(\\d{10})$";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    String name = matcher.group(1);
                    String mobileNo = matcher.group(2);
                    customers.add(new Customer(name, mobileNo));
                } else {
                    System.out.println("Invalid entry: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        Collections.sort(customers, Comparator.comparing(Customer::getName));

        System.out.println("Sorted Customer List:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    static class Customer {
        private String name;
        private String mobileNo;

        public Customer(String name, String mobileNo) {
            this.name = name;
            this.mobileNo = mobileNo;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " " + mobileNo;
        }
    }
}
