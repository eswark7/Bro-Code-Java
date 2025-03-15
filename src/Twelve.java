import java.util.*;
public class Twelve {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name to find the length");
        String name = scan.nextLine();
        if(name.isEmpty()){
            System.out.println("Please! Enter the String");
        }
        else {
            int length = name.length();
            System.out.println("The Length is :" + length);
            int index = name.indexOf("s");
            System.out.println(index);
            char letter=name.charAt(0);
            System.out.println(letter);
            int lastindex = name.lastIndexOf("a");
            System.out.println(lastindex);
            //name =name.toLowerCase();
            //System.out.println(name);
            //name =name.toUpperCase();
            //System.out.println(name);
            //name = name.trim();
            //System.out.println(name);
            //name = name.replace("o","a");
            //System.out.println(name);
            //System.out.println(name.isEmpty());
        }
    }
}
