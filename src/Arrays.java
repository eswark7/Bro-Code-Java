// Arrays are used to store multiple values in a single variable,
// instead of declaring separate variables for each value.

public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Audi", "Benz"};
        int[] numbers = {10, 20, 30};

        cars[0] = "Volvo";
        numbers[0] = 100;

        System.out.println("Updated car: " + cars[0]);
        System.out.println("Updated number: " + numbers[0]);

        System.out.println("\nCar brands:");
        for (String car : cars) {
            System.out.println(car);
        }

        int[] ages = {20, 21, 20, 22, 17, 19, 23};
        float avg, sum = 0;
        int length = ages.length;

        System.out.println("\nLength of the ages array: " + length);
        System.out.println("Ages in the array:");

        for (int age : ages) {
            System.out.println(age);
            sum += age;
        }

        avg = sum / length;
        System.out.println("Average age: " + avg);

        //Multi-Dimensional Array

        int[][] myNumbers = {
                {1, 2, 3},
                {5, 6, 7}
        };

        System.out.println("\nMultidimensional Array:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
          //  System.out.println();
        }
    }
}
