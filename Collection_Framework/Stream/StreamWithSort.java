package Collection_Framework.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamWithSort {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
             .sorted(Comparator.comparingInt(String::length))
             .forEach(System.out::println);
        
        names.stream()
             .sorted(Comparator.comparingInt(String::length).reversed())
             .forEach(System.out::println);
        
        names.stream()
             .sorted((a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b); // alphabetical
                 }
                    return Integer.compare(a.length(), b.length());
                })
             .forEach(System.out::println);
    }
}