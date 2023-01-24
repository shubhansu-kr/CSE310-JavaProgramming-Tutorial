import java.util.*;

class Solution {
    static int x = 21;

    // Multiple static blocks : Allowed
    static {
        System.out.println("Static0");
    }

    static {
        System.out.println("Static1");
    }

    static {
        System.out.println("Static2");
    }

    {
        System.out.println("Init0");
        x++;
    }

    {
        System.out.println("Init0");
        x++;
    }

    {
        System.out.println("Init0");
        x++;
    }

    Solution(){
        System.out.println("Constructor");
        System.out.println(x); // prints 24;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
    }
}