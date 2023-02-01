// WAP To swap two number using function

import java.util.*;

class Solution {

    // Logic Fails, because we are not passing the variable with arguments. 
    // Use instance var instead
    static void swap(int a, int b) {
        int temp = a; 
        a = b; 
        b = temp;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + " " + b);
        swap (a, b);
        System.out.println(a + " " + b);
    }
}