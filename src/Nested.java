import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isStudent, isSenior;
        double price = 100;

        System.out.println("Are You A Student (true/false)?");
        isStudent = scan.nextBoolean();

        System.out.println("Are You A Senior (true/false)?");
        isSenior = scan.nextBoolean();

        if (isStudent) {
            if (isSenior) {
                System.out.println("You Get a Student discount of 20%");
                System.out.println("You Get a Senior discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You Will Get a Student Discount of 10%");
                price *= 0.9;
            }
        } else if (isSenior) {
            System.out.println("You Get a Discount of 20%");
            price *= 0.8;
        }

        System.out.println("Final Price: " + price);
        scan.close();
    }
}
