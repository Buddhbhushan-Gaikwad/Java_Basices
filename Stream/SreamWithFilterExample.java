package Stream;

import java.util.Arrays;

public class SreamWithFilterExample {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
             .filter(name -> name.length() <= 3)
             .forEach(System.out::println);
        
    }
}
