import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaReduce {
    public static void main(String[] args) {
        List<Integer> ListElements = Arrays.asList(6,9,10,3,7,3,2);
        Integer value = ListElements.stream().reduce((a,b)-> a+b).get()/ListElements.size();
        System.out.println(value);
        int max = 0;
        for(int i = 0 ; i<ListElements.size();i++){
            if (ListElements.get(i)>max){
                max = ListElements.get(i);
            }
        }
        System.out.println(max);
    }
}
