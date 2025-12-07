package Collection_Framework;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);

        System.out.println(map);
        // Output: {Apple=1, Banana=3, Mango=2}
    }
}
