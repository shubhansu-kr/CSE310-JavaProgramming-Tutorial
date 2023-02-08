// Constructor Chaining.

import java.util.*;

class Solution {
    // D D 21 D 21 21  15
    Solution() {
        System.out.println("D");
    }
    Solution(int i) {
        this(); // calls Solution()
        System.out.println(i);
    }
    Solution(int i, int j){
        this(i);  // calls Solution(i)
        // this(i); : Error; We cannot add multiple this 
        System.out.println(i + " " + j);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
        Solution obj2 = new Solution(21);
        Solution obj3 = new Solution(21, 15);
    }
}

class Solution1 {
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
