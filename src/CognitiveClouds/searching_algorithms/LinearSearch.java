package CognitiveClouds.searching_algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {8,9,7,6,5,4,3,2,1};
        int num = 97;
        System.out.println("Number found at: "+linearSearch(num, array));
    }

    private static int linearSearch(int num, int[] array) {
        for(int i=0; i<array.length; i++){
            if(array[i]==num){
                return i;
            }
        }
        return -1;
    }
}
