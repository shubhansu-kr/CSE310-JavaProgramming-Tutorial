import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a + b = " + a + b);
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("c % b = " + (c % b));
        System.out.println("c / b = " + (c / b));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("++a + b = " + (++a + b));

        char c1 = 'A';
        char c2 = 'A';
        System.out.println("c1 + c2 = " + (c1 + c2));

        System.out.println(d + " " + (++d) + " " + (d++));
        
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = 21;
        int a = 15;

        c =- a;
        System.out.println(c);
    }
}

class Solution2 {
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
