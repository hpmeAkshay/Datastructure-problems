package CognitiveClouds;

public class FactorialByRecurssion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial of "+n+" is: "+findFactorial(n));
    }

    private static int findFactorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}
