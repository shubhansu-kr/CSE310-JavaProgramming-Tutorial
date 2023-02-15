// Method Overriding in Java

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        scientificCalculator Obj = new scientificCalculator();
        System.out.println(Obj.add(21, 15));
        System.out.println(Obj.difference(21, 15));
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
        // System.out.println(this.add(a, b)); recursive call 
        return a+b+10;
    }

    int difference(int c, int d) {
        System.out.println("Difference method: " + super.add(c, d));
        return this.add(c, d)-super.add(c, d);
    }
}