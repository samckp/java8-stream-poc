package edu.java8.poc.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    //how many ways to create stream object.
    public static void main(String[] args) {

        //1. Empty stream
        Stream<Object> stream = Stream.empty();


        String str[] = {"AAA", "BBB", "CCC", "FFF", "EEE", "HHH"};

        //2 Stream from arrays
        Stream<String> stream1 = Stream.of(str);
        stream1.forEach(System.out::println);

        //3.
        Stream<Object> streaObj = Stream.builder().build();

        //4.
        IntStream stream2 = Arrays.stream(new int[]{1,2,3,4,5,6,7,8});
            stream2.forEach(System.out::println);
    }
}
