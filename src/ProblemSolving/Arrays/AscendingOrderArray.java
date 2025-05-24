package ProblemSolving.Arrays;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,1,8,2,5,6};
        for(int i=0; i< arr.length; i++){
            for(int j = i; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
