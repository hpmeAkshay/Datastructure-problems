package CognitiveClouds;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        for(int i=0; i<num; i++){
            System.out.print(firstNum+" ");
            int total = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = total;
        }
    }
}
