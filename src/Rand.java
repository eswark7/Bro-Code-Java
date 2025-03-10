import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        //RANDOM NUMBERS
        Random randm = new Random();

        int number1;
        double number2;
        int number3;
        boolean isHeads;

        number1 = randm.nextInt(1,10);
        System.out.println(number1);

        number2 = randm.nextDouble(1.0,10.0);
        System.out.println(number2);

        number3 = randm.nextInt(1,10);
        System.out.println(number3);

        isHeads = randm.nextBoolean();

        if(isHeads == true){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
