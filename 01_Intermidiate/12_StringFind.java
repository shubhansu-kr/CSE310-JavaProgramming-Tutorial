// Searching in String

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
        // indexOf(char, startIndex)
        // indexOf(string, startIndex)

        // lastIndexOf(char, StartIndex)
        // lastIndexOf(string, startIndex) 

        // All these methods search the string for pattern from start index to last index. 
        // Returns the index of first char of Matching string if match found otherwise returns -1;

        String s = "Shubh";

        // We can put the index greater than length (No condition)
        System.out.println(s.indexOf('s', -1));

        String s1 = "aababaabaababababababababaaabbbbaaabaaabaabaababababababaabaabaabaabaabaabaabaabaabaabaabaab";
        String s2 = "aab";

        // Find the second occurrence of s2 in s1 
        System.out.println(s1.indexOf(s2, s1.indexOf(s2)+1)); 
        
        // even if we get -1 from the first indexOf method, we are adding 1 to get 0 and search the string again


        // Find the nth matching string index.
        int n = sc.nextInt();
        int searchIndex = 0;
        while(n-- != 0) {
            searchIndex = s1.indexOf(s2, searchIndex) + 1;
            if (searchIndex == -1) {
                break;
            }
        }

        System.out.println(searchIndex);
        

    }
}