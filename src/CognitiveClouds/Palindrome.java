package CognitiveClouds;

public class Palindrome {
    public static void main(String[] args) {
        String string = "onkno";
        System.out.println("Is '"+string+"' a palindrome: "+isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length()-1;
        while(start < end){
            if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }


}
