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

        //numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        numbers.stream().map().
    }
}
