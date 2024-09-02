package String;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "You are welcome";
        removeVowsels(str);
    }

    public static void removeVowsels(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
