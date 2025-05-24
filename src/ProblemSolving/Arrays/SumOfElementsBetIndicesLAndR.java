package ProblemSolving.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfElementsBetIndicesLAndR {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[][] Queries= {{1, 3}, {0, 4}, {2, 2}};

        int[] prefixSumArray = PrefixSumArray.prefixSum(arr);
        System.out.println(Arrays.toString(prefixSumArray));
        int sum = prefixSumArray[3] - prefixSumArray[1-1];
        System.out.println("Sum of elements: "+ sum);
    }
}
