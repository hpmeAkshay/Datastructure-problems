package ProblemSolving.Arrays.Array_Hashmap;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {3,3,4,4,5,6,7,};
        System.out.println(nonRepeatingElement(arr));
    }

    private static int nonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int num: arr){
            if (freq.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
