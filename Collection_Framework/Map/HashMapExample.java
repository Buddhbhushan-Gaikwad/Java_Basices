package Collection_Framework.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);

        System.out.println(map); 
        // Output: Order will be random, e.g.: {Apple=1, Mango=2, Banana=3}
    }
}