package ProblemSolving.Arrays;

public class TripletWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 15;
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left = i+1;
            int  right = n-1;
            while(left<right){
                int sum = arr[i]+ arr[left]+ arr[right];
                if(sum == target){
                    System.out.println("Triplet found: ("+arr[i]+", " +arr[left]+", "+ arr[right]+")");
                    left++;
                    right--;
                    while(left<right && arr[left] == arr[left+1]) left++;
                    while(left<right && arr[right] == arr[right-1]) right--;
                }else if(sum < target) left++;
                else right--;
            }
        }
    }
}
