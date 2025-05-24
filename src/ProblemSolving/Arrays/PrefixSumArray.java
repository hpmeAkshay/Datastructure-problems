package ProblemSolving.Arrays;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        // a prefix sum array is an arrays which is use to store sum all the elements from 0 to i at i.
        int[] arr = {2,3,4,5,6,4,7};
        System.out.println("Prefix sum array: "+ Arrays.toString(prefixSum(arr)));
    }
    public static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
}


