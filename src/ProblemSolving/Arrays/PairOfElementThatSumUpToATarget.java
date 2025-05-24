package ProblemSolving.Arrays;

public class PairOfElementThatSumUpToATarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 10;
        int i= 0;
        int j= arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target) {
                System.out.println("The pair is: ("+arr[i]+" ,"+arr[j]+")");
                return;
            }
            else if(sum < target) i++;
            else j--;
        }
    }
}
