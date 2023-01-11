// Take an input from the user and check if the input number is odd or even

import java.util.*;

class Solution {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a whole number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}