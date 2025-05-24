package ProblemSolving.Arrays.Array_Hashmap;

import java.util.HashMap;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,3};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for()
    }

}
