import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(50);
        set1.add(10);
        set1.add(null);
        System.out.println(set1);

    }
}
