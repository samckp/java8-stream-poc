package edu.java8.poc.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Blr");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Jsr");

        cities.stream().filter(e-> e.length() >= 4)
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);
                ;

    }
}
