import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Scanner;
public class Shopping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String item;
        int cost;
        int quantity;
        double total;
        System.out.print("Enter Item Name : ");
        item = scan.nextLine();

        System.out.print("Enter Cost of each individual item $ : ");
        cost = scan.nextInt();

        System.out.print("Enter how Many Would You Like : ");
        quantity = scan.nextInt();

        char Currency = '$';

        total = cost*quantity ;
        System.out.println("You Have Bought "+quantity+" "+item);
        System.out.println("Your Total Cost is "+total+Currency);

        scan.close();
    }
}
