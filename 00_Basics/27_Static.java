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

class Solution1 {

    static int x;

    // constructor is executed only when an object is created.
    Solution(){
        System.out.println("Constructor");
    }

    // static is executed automatically even before the main function. 
    static{
        System.out.println("Static Block Started");
        System.out.println(x);
    }

    // Initialiser block: Executed automatically just before constructor.
    {
        System.out.println("Initialiser Block");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Main Started");
        Solution obj1 = new Solution();
    }

    // Output: 
    // Static Block Started
    // 0
    // Main Started
    // Initialiser Block
    // Constructor
}


class Solution2 {

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

    // Using initialiser without constructor: Multiple initialiser allowed but no use without object.
    {
        System.out.println("Init0");
    }

    {
        System.out.println("Init0");
    }

    {
        System.out.println("Init0");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
    }
}


class Solution3 {
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
