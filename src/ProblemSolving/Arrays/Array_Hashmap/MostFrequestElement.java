package ProblemSolving.Arrays.Array_Hashmap;

import java.util.HashMap;

public class MostFrequestElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,6,5,4,3,2,3,5, 5};
        System.out.println(mostFrequentNumber(arr));
    }

    private static int mostFrequentNumber(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFrequentCount = 0;
        int mostFrequentNumber = arr[0];
        for(int num: arr){
            int count = freq.getOrDefault(num, 0)+1;
            freq.put(num, count);
            if (count > maxFrequentCount){
                maxFrequentCount = count;
                mostFrequentNumber = num;
            }
        }
        return mostFrequentNumber;
    }
}
