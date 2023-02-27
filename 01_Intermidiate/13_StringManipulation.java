// String Manipulation

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
        // S.substring(startIndex) ; Takes substring from startIndex to lastChar of String. 
        // S.substring(startIndex, endIndex) ; EndIndex is exclusive

        String s = "0123456789";

        System.out.println(s.substring(4)); // 456789
        System.out.println(s.substring(3, 5)); // 34 : 5 is not included. 


        String s1 = "I am programming";
        
        // S.replace(target String, replacement String) : replaces all the occurrence of target.
        s1 = s1.replace("am", "was");
        System.out.println(s1);

        s1 = s1.replaceAll("was", "am");
        System.out.println(s1);

        // replaceFirst() : Replaces only the first occurrence of target. 
        s1 = s1.replaceFirst("am", "was"); 
        

        // trim() : Removes any trailing or leading spaces. 
        String s2 = "  Shubh   ";
        s2.trim();
        System.out.println(s2);

        // split(regex) : Splits the string on the basis of target regex and returns the array of Strings.
        String word[] = s1.split(" ");
        for (String xString : word) {
            System.out.println(xString);
        }

        String s3 = "This.is.designed.to.test.the.split.method.";

        String sp[] = s3.split(".", 0); 
        System.out.print(sp.length + " : "); // 0
        for (String xString : sp) {
            System.out.print(xString + " ");
        }

        System.out.println();

        sp = s3.split(".", 10); 
        System.out.print(sp.length + " : "); // 10
        for (String xString : sp) {
            System.out.print(xString + " ");
        }

        System.out.println();

        sp = s3.split(".", -1); 
        System.out.print(sp.length + " : "); // 43
        for (String xString : sp) {
            System.out.print(xString + " ");
        }

        System.out.println();

    }
}