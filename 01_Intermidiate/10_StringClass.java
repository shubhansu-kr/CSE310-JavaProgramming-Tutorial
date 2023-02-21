// String Class In Java

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        String uni = "LPU";
        uni = "Lovely Professional University";
        System.out.println(uni);

        // Strings are immutable in java 
        String a = "Lovely";
        String b = "University";
        String c = a + "Professional" + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char cArray[] = {'a', 'b', 'c', 'd'};
        byte bArray[] = {65, 66, 67, 68};

        // Constructor of string. 
        String s1 = new String(cArray);
        String s2 = new String(bArray);
        // byte is converted to ascii 

        // offset : index || count : length
        String s3 = new String(cArray, 2, 2);
        String s4 = new String(cArray, 0, 2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}