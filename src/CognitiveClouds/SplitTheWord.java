package CognitiveClouds;

import java.util.ArrayList;

public class SplitTheWord {
    public static void main(String[] args) {
        String string="You are welcome.";
        String[] stringArray = splitTheWord(string);
        for(String s: stringArray){
            System.out.println(s);
        }
    }

    private static String[] splitTheWord(String s) {
        if(s == null || s.isEmpty()){
            return new String[0];
        }
        char[] c = s.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for(char p: c){
            if (p ==' '){
                if(!word.isEmpty()){
                    words.add(word.toString());
                    word.setLength(0);
                }
            }else{
                word.append(p);
            }
        }
        if (!word.isEmpty()){
            words.add(word.toString());
        }
        return words.toArray(new String[0]);
    }


}
