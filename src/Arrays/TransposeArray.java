package Arrays;

import java.util.Arrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        trsnsposeArray(array);
        for(int i= 0; i< array.length; i++){
            for(int j= 0; j< array.length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] trsnsposeArray(int[][] array) {
        for(int i = 1; i < array.length; i++){
            for (int j = 0; j<i; j++){
               int temp = array[i][j];
               array[i][j] = array[j][i];
               array[j][i]=temp;
            }
        }
        return array;
    }
}
