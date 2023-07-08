import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter \n 1 : Addition \n 2 : Subtraction \n 3 : Multiplication \n 4 : Division ");
        int input = sc.nextInt();
        //old case

        //new case
        switch (input) {
            case 1 -> System.out.println("Sum = " + (a + b));
            case 2 -> System.out.println("Sub = " + (a - b));
            case 3 -> System.out.println("Mul = " + (a * b));
            case 4 -> System.out.println("Div = " + (a / b));
            default -> System.out.println("Invalid");
        }
    }

}
