package String;

public class ReverseStringByWord {
    public static void main(String[] args) {
        String string = "You are welcome";
        System.out.println(reverseString(string));
    }

    private static String reverseString(String A) {
        String[] array = A.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for(int i=array.length-1; i>=0; i--){
            reversedString.append(array[i]);
            if(i != 0){
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}
