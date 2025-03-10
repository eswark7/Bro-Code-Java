import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String adjective1;
        String noun1;
        String place1;
        String verb1;
        String exclamation1;

        System.out.println("Enter Adjective(Describes how the day feels)");
        adjective1 = scan.nextLine();

        System.out.println("Enter Noun(Something that melts in heat)");
        noun1 = scan.nextLine();

        System.out.println("Enter Place(Where the heatwave is happening)");
        place1 = scan.nextLine();

        System.out.println("Enter Verb(An action to escape the heat )");
        verb1 = scan.nextLine();

        System.out.println("Enter exclamation (A reaction to the heat )");
        exclamation1 = scan.nextLine();

        System.out.println("\n🌞 **Your Heatwave Story** 🌞\n");

        System.out.println("It was a " + adjective1 + " June afternoon.");
        System.out.println("The " + noun1 + " was melting under the scorching sun at " + place1 + ".");
        System.out.println("People tried to " + verb1 + ", but the heat was too " + adjective1 + ".");
        System.out.println("Even the " + noun1 + " looked like it was struggling!");
        System.out.println("Suddenly, a strong gust of hot wind blew, making everything feel even worse.");
        System.out.println("I wiped my sweat and shouted, \"" + exclamation1 + "!\"");
        System.out.println("There was no escape from the blazing heat—just another crazy summer day!");
        System.out.println("\n🔥 Stay hydrated and beat the heat! 🔥");

        scan.close();
    }
}
