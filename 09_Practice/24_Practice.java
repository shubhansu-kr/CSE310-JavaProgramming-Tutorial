// Interface

import java.util.*;

@FunctionalInterface
interface A {
    public boolean isEven(int n);
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        A obj = (int n) -> {return n%2==0;};
        A obj1 = (int n) -> (n%2 == 0);
        A obj2 = (n) -> n%2 == 0;
        A obj3 = n -> n%2 == 0;

        System.out.println(obj.isEven(2));
        System.out.println(obj1.isEven(3));
        System.out.println(obj2.isEven(4));
        System.out.println(obj3.isEven(5));
    }
}