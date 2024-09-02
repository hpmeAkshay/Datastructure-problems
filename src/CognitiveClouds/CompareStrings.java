package CognitiveClouds;

public class CompareStrings {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "helLo";
        System.out.println("Are strings equal (Equals): "+compareWithEquals(string1, string2));
        System.out.println("Are strings equal (EqualsIgnoreCase): "+compareWithEqualsIgnoreCase(string1, string2));
        System.out.println("Are strings equal (compareTo): "+compareWithcompareTo(string1, string2));

    }

    private static boolean compareWithEquals(String string1, String string2) {
        if(string1.equals(string2)){
            return true;
        }else return false;
    }

    private static boolean compareWithEqualsIgnoreCase(String string1, String string2){
        if(string1.equalsIgnoreCase(string2)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean compareWithcompareTo(String string1, String string2){
        int result = string1.compareTo(string2);
        if (result == 0) {
            return true;
        }else return false;
    }
}
