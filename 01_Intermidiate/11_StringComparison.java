// String Comparisons.

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        String s1 = "Lovely Professional University";
        String s2 = "Lovely" ;
        String s3 = "University";

        String s4 = "Lovely";

        // S.startsWith(s) : Matches the prefix 
        // S.endsWith(s) : Matches the suffix

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s3));

        // S.equals(s) : Method to compare the strings 
        if (s2.equals(s4)) {
            System.out.println("S2 and S4 are equal");
        }
        else {
            System.out.println("S2 and S4 are not equal");
        }

        if (s2.equals(s3)) {
            System.out.println("S2 and S3 are equal");
        }
        else {
            System.out.println("S2 and S3 are not equal");
        }

        // S.compareTo(s) : Compares the strings lexographically
        // less than 0 if S is smaller the s
        // greater than 0 if S is greater than s
        // Zero if both strings matches.

        // Returns the difference of first unmatched char. 

        System.out.println(s1.compareTo(s2)); // 24
        System.out.println(s1.compareTo(s3)); // -9
        System.out.println(s2.compareTo(s3)); // -9
        System.out.println(s2.compareTo(s4)); // 0
        System.out.println(s4.compareTo(s4)); // 0

        
    }
}