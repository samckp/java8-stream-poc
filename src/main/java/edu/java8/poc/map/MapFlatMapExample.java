package edu.java8.poc.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMapExample {

    public static void main(String[] args) {

        List<Customer> custs = getAll();

        System.out.println("List of Emails :: " + custs.stream().map(e->e.getEmail()).collect(Collectors.toList()));

        List<List<String>> phNumber = custs.stream().map(e->e.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("phone numbers using map() : " + phNumber);

        // collect phone numbers using flatMap
        List<String> phoneNums = custs.stream().flatMap(e->e.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println("phone numbers using flatMap() : " + phoneNums);

        // reduce ()
        Integer sum = Stream.of(2,4,6,7,9,1,3,11)
                .reduce(0, (a, b) -> a+b);

        System.out.println("sum of numbers by reduce() :: " + sum);

        String str = Stream.of("AAA", "BBB", "GGG", "PPP")
                .reduce("Values : ", (a, b) -> a + ", "+b);

        System.out.println(str);
    }

    public static List<Customer> getAll() {

        return Stream.of(
                new Customer(101, "james", "james@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }

}
