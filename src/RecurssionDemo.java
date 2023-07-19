public class RecurssionDemo {
    public static void main(String[] args) {
        int a = 1;
        f1(a);
    }

    public static void f1(int a) {
        if(a<100){
            System.out.println(a);
            a++;
            f1(a);
        }
    }
}
