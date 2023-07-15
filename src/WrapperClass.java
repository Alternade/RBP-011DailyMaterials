public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 20;
        //upcasting -is not explicit
        double c = a;
        //downcasting - it should be explicit
        double e = 15.8;
        String s1 = "178928";
        int f = Integer.parseInt(s1);
        System.out.println(f);
        int d = (int) e;
        System.out.println(d);
    }
}
