package CognitiveClouds;

public class FindVowelsConsonants {
    public static void main(String[] args) {
        String string ="You are welcomeI";
        findVowelsConsonants(string);
    }

    private static void findVowelsConsonants(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch==' ') continue;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowels.append(ch+" ");
            }else consonants.append(ch+" ");
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
