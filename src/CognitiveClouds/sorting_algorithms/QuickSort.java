package CognitiveClouds.sorting_algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6,5,4,0,2,3,1,1,1,3,6,5,9, -1};
        System.out.println("Bubble sorted array: "+ Arrays.toString(buubleSort(array)));
    }

    private static int[] buubleSort(int[] array) {
        int n = array.length;
        for(int i=0; i< n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
