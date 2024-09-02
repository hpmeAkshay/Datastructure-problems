package Arrays;

public class Rotate2DArrayClockwiseBy90 {
    private static void rotateArrayClockwise(int[][] array) {
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j<i; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i]=temp;
            }
        }
        for(int i=0; i<array.length; i++){
            int left = 0;
            int right= array.length-1;
            while(left<right){
               int temp = array[i][left];
               array[i][left++] = array[i][right];
               array[i][right--]= temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateArrayClockwise(array);
        for(int i= 0; i< array.length; i++){
            for(int j= 0; j< array.length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
