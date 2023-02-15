// Method Overriding in Java

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        scientificCalculator Obj = new scientificCalculator();

        System.out.println(Obj.findWeight(10)); // 98.0 takes value of g as 9.8
        System.out.println(Obj.findWeight(10, 10)); // 100.0 takes value of g as 10 from super class.
    }
}

class Calculator {

    float g = 10f;
    float findWeight(int a) {
       return g * a;
    }
}

class scientificCalculator extends Calculator {

    float g = 9.8f;

    float findWeight(int a) {
        return a*g;
    }

    float findWeight(int a, int b) {
        return a * super.g;
    }
}