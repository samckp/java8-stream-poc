package edu.java8.poc;

public class TwoNumSums {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5};

        int res[] = sum(arr, 9);
        System.out.println(sum(arr, 9)) ;
    }

    public static int[] sum(int []arr, int target){

        int[] result = new int[2];

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){

                if((arr[i] + arr[j])==target){

                    result[0] =i;
                    result[1] =j;
                }
            }
        }
        return result;
    }
}
