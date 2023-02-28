// Practice: WAP to chain constructor

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    int roll;
    String name;

    // Initialiser Block.
    {
        roll = -1; // -1 represents null.
        name = null;
    }

    Solution(){}
    
    Solution(int roll){
        this(roll, "name");
    }
    
    Solution(String name) {
        this(21, name);
    }
    
    Solution(int roll, String name) {
        this.roll = roll;
        this.name = name;
        
        System.out.println("Name: " + name + " Roll: " + roll);
    }
    public static void main(String args[]){
        
    }
}