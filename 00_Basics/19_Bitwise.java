import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int b = 10, res = b >> 2, rss = b >>> 2;
        System.out.println(b + " " + res + " " + rss);

        b =20;
        b = b >> 3;

        System.out.println(b);

        b = 20;
        b = 3 << b;
        System.out.println(b);
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        byte b = 30;
        System.out.println(~b); // -31

        b = -53;
        System.out.println(~b); // 52

        b = -64;
        System.out.println(~b); // 63
        

        System.out.println(34 >> 3); // 4
        System.out.println(-34 >> 3); // -5
        
        System.out.println(-34 >>> 3); // 536870907
    }
}