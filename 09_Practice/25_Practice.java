// Capitalise

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        char c = 'A';
        c += 32;
        System.out.println(c);

        String s = "Shubh";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 'a' && c <= 'z'){
                System.out.print((char)(c-32));
                s1 += (char)(c-32);
            }
            else {
                System.out.print(c);
                s1 += c;
            }
        }
        System.out.println();
        System.out.println(s1);
    }
}