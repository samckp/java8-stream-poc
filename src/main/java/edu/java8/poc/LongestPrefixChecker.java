package edu.java8.poc;

import java.util.Arrays;

public class LongestPrefixChecker {

    public static void main(String[] args) {

        String[] arr = {"flower","flower","flower","flower"};//"mint", "mini", "mineral"};  //{"keeping","keepers","keeptyr"}

        System.out.println("longest prefix :: " + prefixChecker(arr));
    }

    public static String prefixChecker(String[] input){

        Arrays.sort(input);

        int size = input.length;
        int length = input[0].length();

        StringBuilder res = new StringBuilder();

        for(int i=0;i<length;i++){

            if(input[0].charAt(i) == input[size -1].charAt(i)){

                res.append(input[0].charAt(i));
            } else {

                break;
            }
        }

        return res.toString();
    }
}

//Algorithm

//1. Sort the array of strings in alphabetical order.
//
//Compare the characters in the first and last strings in the array. Since the array is sorted,
//common characters among the first and last element will be common among all the elements of the array.
//
//2.1. If they are same, then append the character to the result.
//
//2.2. Else, stop the comparison – result contains the longest common prefix among the strings in the array.
