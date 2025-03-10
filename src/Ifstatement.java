import java.util.Scanner;
public class Ifstatement {
    public static void main(String[] args) {
        // IF Statement
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = scan.nextLine();

        if(name.isEmpty()){
            System.out.println("You Did't Enter Your Name");
        }

        System.out.print("Enter salary: ");
        int salary = scan.nextInt();


        if (salary <= 336000) {
            System.out.println("You Belongs To Ninja Categorie");
        }
        else if (salary > 336000 && salary <= 700000) {
            System.out.println("You Belongs To Digital Categorie");
        }
        else {
            System.out.println("You Belongs to Prime Categorie");
        }

        scan.close();
    }
}
