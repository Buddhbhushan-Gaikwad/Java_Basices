package Collection_Framework.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);

        System.out.println(map);
        // Output: {Banana=3, Apple=1, Mango=2}
    }
}
