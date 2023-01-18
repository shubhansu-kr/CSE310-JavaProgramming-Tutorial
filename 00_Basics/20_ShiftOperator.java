import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = 50,  b = 13, c = 0;
        
        c = a & b;
        System.out.println(c);

        c = a | b;
        System.out.println(c);

        c = a ^ b;
        System.out.println(c);

        c = ~a;
        System.out.println(c);
        
        c = a << 2;
        System.out.println(c);
        
        c = a >>> 2;
        System.out.println(c);

        int gg = -60;
        c = gg >>> 2;
        System.out.println(c);

        int x = -1;
        c = x >>> 32;
        System.out.println(c);

        c = x >>> 33;
        System.out.println(c);

        c = x >>> 34;
        System.out.println(c);
    }
}