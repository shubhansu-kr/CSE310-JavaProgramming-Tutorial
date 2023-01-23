import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // By default break; cuts out of the nearest block. 
        // But if we use labelled break, it redirects the control to the 
        // label statement.


        // Rules for labels: 
        // We can only give labels to loops and break out of it.

        outer: 
        for(int i = 0; i < 10; i++) {
            inner:
            for(int j = 0; j < 10; ++j){
                // Skip the iteration when i == 3 and resume from 4;
                if (i == 3) break;

                // skip the iteration when i == 5 and break out of inner loop;
                if (i == 5) break inner;

                // skip any iteration when i == 7 and break out of outer loop.
                if (i == 7) break outer;
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        System.out.println("We are out of outer loop");
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // labelled Continue; Unlabelled Continue;

        // Rules for labels: 
        // We can only give labels to loops and break out of it.

        // Same labels can be used with continue also;
        outer: 
        for(int i = 0; i < 10; i++) {
            inner:
            for(int j = 0; j < 10; ++j){
                // Skip the iteration when j == 3 and resume from 4;
                if (j == 3) continue;

                // skip the iteration when i == 5 and continue inner loop for i == 6;
                if (i == 5) continue inner;

                // skip any iteration when i == 7 and continue inner loop for i == 8;
                if (i == 7) continue outer;
                System.out.print( "("+ i + ", " + j + ")" + " ");
            }
            System.out.println();
        }

        System.out.println("We are out of outer loop");
    }
}