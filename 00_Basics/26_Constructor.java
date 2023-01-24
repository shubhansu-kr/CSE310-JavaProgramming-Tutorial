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

class Solution3 {
    // Experiments on constructors access specifier
    // All the three access specifiers are allowed.
    // 1. public 
    // 2. private
    // 3. protected

    // What are these specifiers.
    // What is the default access specifiers.

    // public access 
    public Solution(){
        System.out.println("Constructor0");
    }

    // private access 
    private Solution(int x){
        System.out.println("Constructor1");
    }

    // protected access 
    protected Solution(int x, int y){
        System.out.println("Constructor2");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Solution obj1 = new Solution();
        Solution obj2 = new Solution(3);
        Solution obj3 = new Solution(3, 2);
    }
}

class Solution4 {
    static int x, y; // Default value of data members: 0

    // Experiment with variable declaration. 
    Solution(){
        System.out.println("Constructor0");

        // Create a non-static variable: Allowed 
        int temp;

        // swap
        temp = x;
        x = y;
        y = temp;

        System.out.println(x + y);
    }

    Solution(int x){
        System.out.println("Constructor1");
        x += x;
        y += y;

        // Static declaration of members are not allowed.
        // static int z = 13;
    }
        
    Solution(int x, int y) {
        System.out.println("Constructor2");

        // Initialise the static variables. 
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println(x + " " + y);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Initialise variable x and y
        Solution obj1 = new Solution(21, 15);
        obj1.display();

        // Swap x and y
        Solution obj2 = new Solution();
        obj1.display();

        // Increase the x and y
        Solution obj3 = new Solution(1);
        obj1.display();
    }
}

class Solution5 {
    // Exp: Static keyword with constructor

    // Error: Static modifier not allowed with constructors.
    // static Solution(){
    //     System.out.println("Constructor0");
    // }
    
    Solution(){
        System.out.println("Constructor 0");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj1 = new Solution();
    }
}