package ProblemSolving.Arrays;

public class CheckIfArrayIsSortedAscending {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,3};
        System.out.println(checkIfArrayIsSorted(arr));
    }
    private static boolean checkIfArrayIsSorted(int [] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
