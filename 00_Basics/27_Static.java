import java.util.*;

class Solution {

    static int x;

    // constructor is executed only when an object is created.
    Solution(){
        System.out.println("Constructor");
    }

    // static is executed automatically.
    static{
        System.out.println(x);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Solution obj1 = new Solution();
    }
}