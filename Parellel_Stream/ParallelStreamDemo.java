package Parellel_Stream;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // parallel + filter()
        // ---------------------------------------------------------
        List<Integer> nums1 = List.of(2, 5, 7, 9, 12, 15);

        List<Integer> result1 = nums1.parallelStream()
                                     .filter(n -> n > 7)
                                     .toList();

        System.out.println("parallel + filter: " + result1); // [9,12,15]


        // ---------------------------------------------------------
        // parallel + map()
        // ---------------------------------------------------------
        List<String> names1 = List.of("rahul", "priya", "amit", "sneha");

        List<String> upper = names1.parallelStream()
                                   .map(String::toUpperCase)
                                   .toList();

        System.out.println("parallel + map: " + upper);


        // ---------------------------------------------------------
        // parallel + sorted()
        // ---------------------------------------------------------
        List<Integer> nums2 = List.of(9, 2, 7, 4, 3, 10);

        List<Integer> sorted = nums2.parallelStream()
                                    .sorted()
                                    .toList();

        System.out.println("parallel + sorted: " + sorted);


        // ---------------------------------------------------------
        // parallel + forEach()
        // ---------------------------------------------------------
        List<String> names2 = List.of("A", "B", "C", "D");

        System.out.println("parallel + forEach (Thread names):");
        names2.parallelStream()
              .forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));


        // ---------------------------------------------------------
        // parallel + forEachOrdered()
        // ---------------------------------------------------------
        List<String> listOrdered = List.of("A", "B", "C", "D");

        System.out.println("parallel + forEachOrdered:");
        listOrdered.parallelStream()
                   .forEachOrdered(System.out::println); // maintains order


        // ---------------------------------------------------------
        // parallel + distinct()
        // ---------------------------------------------------------
        List<Integer> nums3 = List.of(2, 5, 5, 7, 7, 9);

        List<Integer> unique = nums3.parallelStream()
                                    .distinct()
                                    .toList();

        System.out.println("parallel + distinct: " + unique); // [2,5,7,9]


        // ---------------------------------------------------------
        // parallel + limit()
        // ---------------------------------------------------------
        List<Integer> nums4 = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> limited = nums4.parallelStream()
                                     .limit(5)
                                     .toList();

        System.out.println("parallel + limit: " + limited);


        // ---------------------------------------------------------
        // parallel + skip()
        // ---------------------------------------------------------
        List<Integer> nums5 = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> skipped = nums5.parallelStream()
                                     .skip(3)
                                     .toList();

        System.out.println("parallel + skip: " + skipped); // from 4


        // ---------------------------------------------------------
        // parallel + reduce()
        // ---------------------------------------------------------
        List<Integer> nums6 = List.of(1, 2, 3, 4, 5);

        int sum = nums6.parallelStream()
                       .reduce(0, (a, b) -> a + b);

        System.out.println("parallel + reduce (sum): " + sum); // 15


        // ---------------------------------------------------------
        // parallel + collect()
        // ---------------------------------------------------------
        List<String> names3 = List.of("rahul", "priya", "amit", "amit");

        Set<String> set = names3.parallelStream()
                                .collect(Collectors.toSet());

        System.out.println("parallel + collect (Set): " + set);
    }
}

