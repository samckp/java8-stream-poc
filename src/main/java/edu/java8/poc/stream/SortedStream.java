package edu.java8.poc.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedStream {

    public static void main(String[] args) {

        Stream<Integer> numStream = Stream.of(6,0,9,1,3,5,4,2);
        numStream.sorted()
                .forEach(System.out::println);

        Stream<Integer> numRevStream = Stream.of(6,0,9,1,3,5,4,2);
        numRevStream.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Stream<String> strStream = Stream.of("A","H","F","Y","T","D","S");
        strStream.sorted().forEach(System.out::println);

        Stream<String> strRevStream = Stream.of("A","H","F","Y","T","D","S");
        strRevStream.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
