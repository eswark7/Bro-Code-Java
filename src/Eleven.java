import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter Principle Amount:");
        principle = scan.nextDouble();

        System.out.println("Enter The Interest Rate (in %):");
        rate = scan.nextDouble() / 100;

        System.out.println("Enter The No of Times Interest is Compounded Per Year:");
        timesCompounded = scan.nextInt();

        System.out.println("Enter The No of Years:");
        years = scan.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %.2f%n", years, amount);

        scan.close();
    }
}
