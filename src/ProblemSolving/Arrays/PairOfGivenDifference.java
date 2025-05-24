package ProblemSolving.Arrays;

public class PairOfGivenDifference {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12};
        int k = 4;
        int i= 0;
        int j= 1;
        while(i<j && j<arr.length){
            int diff = arr[j]-arr[i];
            if( diff == k){
                System.out.println("True");
                return;
            }else if(diff < k) j++;
            else i++;
        }
        System.out.println("False");
    }
}
