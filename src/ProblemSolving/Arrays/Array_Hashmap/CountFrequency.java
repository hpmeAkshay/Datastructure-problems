package ProblemSolving.Arrays.Array_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,3,4,5,2,7,8,9,6,4,5,3};
        countFrequency(arr);
    }

    private static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+ " -> "+entry.getValue());
        }
    }
}
