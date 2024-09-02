package String;

public class CapitalToLower {
    public static void main(String[] args) {
        String str = "Akshay Kadam";
        capitalToLower(str);
    }
    public static void capitalToLower(String str){
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length-1; i++){
            char s = chars[i];
            if(s >= 'A' && s <= 'Z'){
                char c = (char)(s - 'A' + 'a');
                chars[i] = c;
            }
        }
        for(char i: chars){
            System.out.print(i);
        }
    }
}
