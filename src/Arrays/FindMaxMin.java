package Arrays;

import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original array: "+Arrays.toString(array));
        int [] maxMin = findMaxMin(array);
        System.out.println("Max value: "+maxMin[0]+", Min value: "+maxMin[1]);
    }
    public static int[] findMaxMin(int[] array){
        int max = array[0];
        int min = array[0];
        for(int i =1;i< array.length; i++ ){
            if (array[i] >= max){
                max = array[i];
            }else if (array[i]< min){
                min = array[i];
            }
        }
        return new int[]{max, min};
    }
}
