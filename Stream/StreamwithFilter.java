package Collection_Framework.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamwithFilter {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
             .filter(name -> name.length() <= 3)
             .map(name -> name.toUpperCase())
             .forEach(System.out::println);
        
    }
}
