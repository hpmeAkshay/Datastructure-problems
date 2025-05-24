package ProblemSolving.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,11,3,5,6,7,9};
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > first){
                sec = first;
                first = num;
            }
            else if (num < first && num!= sec){
                sec = num;
            }
        }
        System.out.println(sec);
    }
}
