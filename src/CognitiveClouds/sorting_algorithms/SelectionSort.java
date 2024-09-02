package CognitiveClouds.sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,6,5,9,1,2,9};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        int n= array.length;
        for(int i=0; i<n-1; i++){
            int minIndex=i;
            for(int j=i+1; j<n-1; j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i] = temp;
        }
        return array;
    }
}
