package edu.java8.poc;

import java.util.stream.Stream;

public class StreamQuery {

    public static void main(String[] args) {

        Stream.iterate(1, num -> num +1)
                .filter(n->n%2==0)
                .limit(10)
                .forEach(System.out::println);

    }
}
