package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamWithMap {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
             .map(name -> name.toUpperCase())
             .map(name -> {
                if(name.startsWith("A"))return "StartedWithA :"+name;
                if(name.length() > 3) return "Long- "+name;
                return name;
             })
             .forEach(System.out::println);
    }
}
