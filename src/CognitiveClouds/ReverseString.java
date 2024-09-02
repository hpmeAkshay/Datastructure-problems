package CognitiveClouds;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(reverseString(string));
    }
    private static String reverseString(String s){
        if (s.length()<=1){
            return s;
        }
        char[] c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<=j){
            char temp= c[i];
            c[i++]=c[j];
            c[j--]=temp;
        }
        return new String(c);
    }
}
