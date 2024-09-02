package CognitiveClouds;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,6,5,3,7,8,8,9,};
        
        Arrays.sort(numbers);
        System.out.println("Ascending order: "+Arrays.toString(numbers));

//        Arrays.sort(numbers, Collections.reverseOrder());
//        System.out.println("Descending order: "+Arrays.toString(numbers));
    }
}
