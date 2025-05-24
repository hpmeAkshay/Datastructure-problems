package ProblemSolving.Arrays;

import java.util.HashMap;

public class CountFrequencies {
    public static void main(String [] args){
        int[] arr = {2,2,3,4,5,5,6,7,2,3,5};
        HashMap<Integer, Integer> fre = new HashMap<>();
        for (int num: arr){
            fre.put(num, fre.getOrDefault(num, 0)+1);
        }
        System.out.println(fre);
    }
}
