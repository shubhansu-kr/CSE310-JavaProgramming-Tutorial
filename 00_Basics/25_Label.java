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

                // skip the iteration when i == 5 and jump to inner label.
                if (i == 5) break inner;

                // skip any iteration when i == 7 and jump to outer label.
                if (i == 7) break outer;
                System.out.print(i + j + " ");
            }
            // inner:
            // We need to place this statement after label;
            System.out.println();
        }

        System.out.println("We are out of outer loop");
    }
}