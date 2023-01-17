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