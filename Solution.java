import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 15, b = 21, c = 13;

        c = a + b;
        System.out.println("c = a + b = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        c /= a;
        System.out.println("c /= a = " + c);
        c %= a;
        System.out.println("c %= a = " + c);
        c =- a;
        System.out.println("c =- a = " + c);
    }
}