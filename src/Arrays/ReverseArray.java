package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array:");
        for(int i : array){
            System.out.println(i+" ");
        }
        reverseArray(array);
        System.out.println("Reversed Array:");
        for(int i : array){
            System.out.println(i+" ");
        }
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }
}
