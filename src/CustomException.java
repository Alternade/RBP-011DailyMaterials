import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyCustomException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int favoriteNumber = 7;
        if (a == favoriteNumber){
            System.out.println("Correct");
        }else{
            throw new MyCustomException("Not My favorite number");
        }
    }
}

class MyCustomException extends Exception{
    public MyCustomException(String s){
        super(s);
    }
}