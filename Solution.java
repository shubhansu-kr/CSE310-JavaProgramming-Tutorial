// Constructor Chaining.

import java.util.*;

class Solution {
    // Error: Constructor Recursion invocation
    Solution() {
        System.out.println("D");
    }
    Solution(int i) {
        this(i, i); // calls Solution(i, j) : Non Ending Loop: Error
        System.out.println(i);
    }
    Solution(int i, int j){
        this(i); // calls Solution(i) : Causes recursive loop.
        System.out.println(i + " " + j);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
        Solution obj2 = new Solution(21);
        Solution obj3 = new Solution(21, 15);
    }
}