public class AbstractionDemo {
    public static void main(String[] args) {
        Bike1 b1 =new Bike1();
        b1.run();
    }
}
interface Vehicle{
    public void run();
    public void run2();
}

class Bike1 implements Vehicle{

    @Override
    public void run() {
        System.out.println("Bike 1 is running");
    }

    @Override
    public void run2() {
        System.out.println("Bike 1 e2 is running");
    }

}