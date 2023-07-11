public class Day2 {
    public static void main(String[] args) {
        int i1=4;
        int i2=9;
        addition();
        compare(i1,i2);
    }
    //method signature
    public static void addition(){
        int a = 10;
        int b = 12;
        System.out.println(a+b);
    }

    public static void compare(int a, int b){
        if(a > b){
            System.out.println("First number is Bigger than 2nd");
        } else if (a<b) {
            System.out.println("Second number is bigger than 1st");
        }else{
            System.out.println("Both number are same");
        }
    }
}
