// Final keyword : use to fix the value of a var.

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    final int x = 21;
    // We have to eagerly initialise if we are using final in instance var.
    // final int y;
    public static void main(String args[]){
        final String Name = "NoN";

        // No Error.  
        final String Name1;
        // We cannot access uninitialised var. 
        // System.out.println(Name + " " + Name1);
        
        Name1 = "NaN";
        
        // Error: We cannot reInitialise local var.
        // Name1 = "NoN";
        
        System.out.println(Name + " " + Name1);

    }
}