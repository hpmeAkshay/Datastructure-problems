package String;
// Given a string A and integer B, remove all consecutive same characters that have length exactly B.

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String str = "aaaddbbsccdd";
        int b=3;
        System.out.println(removeConsecutiveChars(str, b));
    }

    private static String removeConsecutiveChars(String A, int B) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        for(int i=1; i<A.length(); i++){
            if(A.charAt(i) == A.charAt(i-1)){
                count++;
            }else if(count != B){
                result.append(A, i-count, i);
                count = 1;
            }else{
                count =1;
            }
        }
        return result.toString();
    }
}
