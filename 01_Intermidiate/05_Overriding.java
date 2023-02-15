// Method Overriding in Java

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        scientificCalculator Obj = new scientificCalculator();
        Obj.add(21, 15);
        
    }
}

class Calculator {
    int add(int a, int b) {
        System.out.println(a + b);
        return a+b;
    }
}

class scientificCalculator extends Calculator {
    int add(int a, int b) {
        System.out.println("Sum of " + a + " " + b + " is " + super.add(a, b));

        return a+b;
    }
}