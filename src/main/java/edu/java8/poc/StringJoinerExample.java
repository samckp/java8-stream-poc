package edu.java8.poc;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        // Passing Hyphen(-) as delimiter
        StringJoiner str = new StringJoiner("-");

        // Joining multiple strings by using add() method
        str.add("Apple");
        str.add("Mango");
        str.add("Coconut");
        str.add("Pineapple");

        // Displaying the output String
        System.out.println(str);

        StringJoiner strOut = new StringJoiner("#");
        strOut.add("tomcat");
        strOut.add("apache");
        strOut.add("Jboss");

        strOut.merge(str);
        System.out.println(strOut);
    }
}
