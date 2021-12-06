package edu.java8.poc.stream;

import java.util.Arrays;
import java.util.List;
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

       //Find minimum from list
        List<Integer> stream3 = List.of(14,2,13,24);
        System.out.println("minimum:: " + stream3.stream().min((x, y) -> x.compareTo(y)).get());

//Find minimum from list
        List<Integer> stream4 = List.of(1,24,23,64);
        System.out.println("maximum:: " + stream4.stream().min((x, y) -> x.compareTo(y)).get());

    }
}
