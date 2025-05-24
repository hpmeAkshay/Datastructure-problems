package ProblemSolving.Arrays;

public class FindMaximumElementInSinglePass {
    public static void main(String[] args) {
        int[] array = {2,4,5,9,6,7};
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(max<array[i]) max = array[i];
        }
        System.out.println(max);
    }

}
