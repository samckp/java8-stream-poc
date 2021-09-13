package edu.java8.poc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Howard", "Camp", "Oxford", "Mellon", "Bits");

        String result = names.stream()
                .collect(Collectors.joining("#\n"));

        System.out.println(result);

        // Print the elements in a order
        System.out.println("Ordered form :: ");
        names.stream()
                .forEachOrdered(name -> System.out.println(name))
        ;


        //numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Print the elements of Collection
        numbers.stream()
                .forEach(System.out::println );

        // Filter the numbers
        numbers.stream()
                .filter(n->n%2==1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /// Sum of numbers from a collection
        Integer sum = numbers.stream()
                        .collect(Collectors.summingInt(x -> x));

        System.out.println("Sum :: " + sum);

        // Find the Average of number.
        Double avg = numbers.stream()
                .collect(Collectors.averagingInt(n-> n));

        System.out.println("Average :: " + avg);

        //Count the number of elements in stream
        Long count = numbers.stream()
                .collect(Collectors.counting())
                ;
        System.out.println("Count :: " + count);
    }
}
