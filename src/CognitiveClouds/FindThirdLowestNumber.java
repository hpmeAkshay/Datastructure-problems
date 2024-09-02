package CognitiveClouds;

public class FindThirdLowestNumber {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,9,3};
        System.out.println("Third lowest number: "+findThirdLowestNumber(array));
    }

    private static int findThirdLowestNumber(int[] array) {
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        int thirdLowest = Integer.MAX_VALUE;
        for(int num: array){
            if(num<firstLowest){
                thirdLowest = secondLowest;
                secondLowest=firstLowest;
                firstLowest=num;
            } else if (num<secondLowest && num!=firstLowest) {
                thirdLowest=secondLowest;
                secondLowest= num;
            } else if (num<thirdLowest && num!=secondLowest && num!=firstLowest) {
                thirdLowest=num;
            }
        }
        return thirdLowest;
    }
}
