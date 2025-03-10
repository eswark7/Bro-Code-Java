public class Main {

    public static void main(String[] args) {

    String name="Eswar";
    int age=20;
    double cgpa=7.1;
    char section='B';
    boolean isStudent=true;

        System.out.println("The Name Of The Student IS "+name);
        System.out.println("The Age Of The Student is "+age+" years");
        System.out.println("The Cgpa Of The Student is "+ cgpa);
        System.out.println("Student Belongs To "+section+" Section");
        System.out.println("is the person student "+ isStudent);
        System.out.println("The Name Of The Student Is "+name+" and age is "+age+". the cgpa of the student is "+cgpa+" student belongs to "+section+" Section is the person student (true/false) = "+isStudent);

            if(isStudent == true) {
                System.out.print("Eswar is a Student");
            }
            else{
                System.out.println("Eswar is not a student");
            }
        }
    }
