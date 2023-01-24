import java.util.*;

class Solution {
    int x;
    
    // Constructors are used to initialise the object. 
    Solution(){
        System.out.println("Inside constructor 0");
        x = 21;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
        System.out.println(obj1.x);
    }
}

class Solution1 {

    int x;
    // Constructor name must match with the class name 
    // Constructor cannot return any data. 

    // Parameterised constructor

    Solution(int x, int y){
        System.out.println("Inside constructor");
        this.x = x+y;
        // the data member is refrenced using this keyword.
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution(3, 2);
        System.out.println(obj1.x);

    }
}

class Solution2 {
    int x, y;

    // Constructor overloading. 
    Solution(){
        System.out.println("Constructor 0");
        x = y = 0;
    }
    Solution(int x){
        System.out.println("Constructor 1");
        this.x = x;
        // Default value will be zero.
        this.y = 0;
    }
    Solution(int x, int y){
        System.out.println("Constructor 2");
        this.x = x;
        this.y = y;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
        Solution obj2 = new Solution(21);
        Solution obj3 = new Solution(21, 15);

        System.out.println(obj1.x + " " + obj1.y);
        System.out.println(obj2.x + " " + obj2.y);
        System.out.println(obj3.x + " " + obj3.y);
    }
}