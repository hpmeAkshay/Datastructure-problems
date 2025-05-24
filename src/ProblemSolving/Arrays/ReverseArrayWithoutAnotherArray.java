package ProblemSolving.Arrays;

import java.util.Arrays;

public class ReverseArrayWithoutAnotherArray {
    public static void main(String[]args) {
        int[] array = {2,3,4,5,6};
        int i=0;
        int j=array.length-1;

        while(i<j) {
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
        System.out.print(Arrays.toString(array));
    }
}
