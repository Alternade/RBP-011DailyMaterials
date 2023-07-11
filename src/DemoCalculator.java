
import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner sc = new Scanner(System.in);
        int exitFlag = 0;
        do {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter \n 1 : Addition \n 2 : Subtraction \n 3 : Multiplication \n 4 : Division ");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> addition(a,b);
                case 2 -> subtraction(a,b);
                case 3 -> multiplication(a,b);
                case 4 -> division(a,b);
                default -> System.out.println("Invalid");
            }
            System.out.println("Enter 1 to exit or any number to repeat");
            exitFlag = sc.nextInt();

        }while(exitFlag != 1);
        //no make not equals false we must make the condition true
        System.out.println("Thnk you for using calculator");
    }
    public static void addition(int a , int b){
        System.out.println("Sum = " + (a + b));
    }

    public static void subtraction(int a, int b){
        System.out.println("Sub = " + (a - b));
    }

    public static void multiplication(int a, int b){
        System.out.println("mul = " + (a * b));
    }

    public static void division(int a, int b){
        System.out.println("Div = " + (a / b));
    }


}
