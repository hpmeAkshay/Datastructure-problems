package CognitiveClouds.searching_algorithms;

import java.util.Arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {5,4,6,7,8,9,1,2,3,99,13};
        Arrays.sort(array);
        int num = 99;
        System.out.println("Number present at: "+jumpSearch(num, array));
    }

    private static int jumpSearch(int target, int[] array){
        int n = array.length;
        int step = (int)Math.sqrt(n);
        int prev = 0;

        while(array[Math.min(step,n)-1] < target){
            prev = step;
            step+= (int)Math.sqrt(n);
            System.out.println("step: "+step);
            if(prev >= n){
                return -1;
            }
        }

        while(array[prev] < target){
            prev++;
            if(prev == n){
                return -1;
            }
            System.out.println("prev: "+prev);
        }

        if(array[prev]==target){
            return prev;
        }
        return -1;
    }
}
