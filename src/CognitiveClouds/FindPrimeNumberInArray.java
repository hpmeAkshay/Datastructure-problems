package CognitiveClouds;

import java.util.ArrayList;

public class FindPrimeNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,11,13,14,15,19};
        int[] primeArray = findPrime(array);
        System.out.print("Prime Numbers: ");
        for(int i: primeArray){
            System.out.print(i+" ");
        }
    }

    private static int[] findPrime(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: a){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int[] primes = new int[list.size()];
        for(int i=0; i<primes.length; i++){
            primes[i] = list.get(i);
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if(number <= 1) return false;
        if(number==2) return true;
        if(number%2==0) return false;
        for(int i=3; i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
