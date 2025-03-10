import java.util.Scanner;

public class Scan {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name : ");   // if we want to enter input in same line then use (print)
        String name=scan.nextLine(); // nextline method is used to take taxt including space
                                        //if we don't want to take space use next()
        System.out.println("Enter your Age : ");
        int age = scan.nextInt();

        System.out.println("Enter your CGPA : ");
        double cgpa= scan.nextDouble();

        System.out.print("Are You enrolled to java course es(true/false): ");
        boolean isStudent=scan.nextBoolean();


        System.out.println("The Name Of The Student Is "+ name);
        System.out.println("The Age Of The Student Is "+ age);
        System.out.println("CGPA Of The Student Is "+ cgpa);

        if(isStudent == true){
            System.out.println(name+" is enrolled to java course ");
        }
        else{
            System.out.println(name+" is not enrolled to java course ");
        }

        scan.close();
    }
}
