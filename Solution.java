import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        b = 5;
        for(a = 0; a < b; a++) {
            System.out.println("a = " + a + " | b = " + b);
            // System.out.println("b = " + b);
            b--;
        }
        System.out.println("Out of loop");
        System.out.println("a = " + a + " | b = " + b);
    }
}