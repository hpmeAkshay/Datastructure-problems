package CognitiveClouds;

import java.util.ArrayList;

public class FindOddEven {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        findOddEven(array);
    }

    private static void findOddEven(int[] array) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i=0; i< array.length; i++) {
            if (array[i] % 2 == 0) {
                odd.append(array[i] + " ");
            } else even.append(array[i] + " ");
        }
        System.out.println("Odd numbers: "+odd);
        System.out.println("Odd numbers: "+even);
    }
}
