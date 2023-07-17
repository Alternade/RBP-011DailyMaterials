import java.util.Scanner;

public class DemoQuestion {
    public static void main(String[] args) {
        int ratio1 = 19;
        int ratio2 = 5;
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int checkNum = sc.nextInt();

        if(checkNum % (ratio1+ratio2) == 0 ){
            System.out.println("The input number is valid in ratio of "+ ratio1 +" : "+ratio2);
        }
        else {
            System.out.println("The input is incorrect ratio");
        }
    }
}
