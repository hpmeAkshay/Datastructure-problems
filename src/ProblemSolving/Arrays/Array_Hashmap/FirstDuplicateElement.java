package ProblemSolving.Arrays.Array_Hashmap;

import java.util.HashSet;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,3,4,6,7,8,9};

        System.out.println(firstDuplicateElement(arr));

    }
    private static int firstDuplicateElement(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i: arr){
            if(seen.contains(i)) return i;
            else seen.add(i);
        }
        return -1;
    }
}
