import java.util.HashMap;
import java.util.LinkedList;

public class GenericsDemo {
    public static void main(String[] args) {
        HashMap< Integer,String > l1 = new HashMap<>();
        l1.put(1,"Ravinder");
        l1.put(2,"Gitesh");
        l1.put(3,"Harshal");
        l1.put(4,"Ravinder");
        System.out.println(l1);
    }
}
