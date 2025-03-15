public class Methods {

    //no parameters and no return value

/*
static  void myMethods()
    {
        System.out.println("Eswar");
    }

public static void main(String[] args)
    {
        myMethods();
    }
}
*/

    //with parameters

    /*
    static void add(int a ,int b)
    {
             int sum = a+b;
             System.out.println(sum);
    }

    public static void main(String[] args)
    {
            add(5, 10);
    }
    }
    */

    //Return value
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(2);
        System.out.println(result);
    }

}

//With method overloading, multiple methods can have the same name with different parameters:

//Recursion is the technique of making a function call itself.
// This technique provides a way to break complicated problems down
// into simple problems which are easier to solve.