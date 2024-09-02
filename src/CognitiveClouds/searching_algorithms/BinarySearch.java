package CognitiveClouds.searching_algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3,5,4,60,7,8,99,2,1,10};
        int num = 60;
        System.out.println("Number present at: "+binarySearchh(num, array));
    }

    private static int binarySearchh(int num, int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(array[mid] == num){
                return mid;
            }
            if (mid < num) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
