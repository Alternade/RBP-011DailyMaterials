import java.util.Scanner;

public class DemoDayLogical {
    public static void main(String[] args) {
        System.out.println("Enter a valid age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18 && age <=60){
            System.out.println("Eligible");
        }else{
            System.out.println("Ineligible");
        }
    }
}
