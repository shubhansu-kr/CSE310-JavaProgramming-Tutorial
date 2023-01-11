// Check if a given number is prime or not 

import java.util.*;

class Solution {

    boolean static isPrime(int num) {
        if (num < 2) return false;
        for(int i = 2; i <= num/2; ++i) if (num % i == 0) return false;
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a whole number: ");
        int i = sc.nextInt();
        System.out.println(i + " : " + isPrime(i));
    }
}