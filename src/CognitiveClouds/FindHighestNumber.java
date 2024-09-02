package CognitiveClouds;

public class FindHighestNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,8,1,99,0};
        System.out.println("Highest number: "+findHighest(array));
    }

    private static int findHighest(int[] array) {
        int max=array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }
}
