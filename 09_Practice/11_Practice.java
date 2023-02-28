import java.util.*;

class Solution {
    int x = 10;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Public Main is a static block and we cannot access non-static
        // members inside the static block
        // Error: 
        // System.out.println(x);

        System.out.println(new Solution().x);
    }
}

class Solution1 {
    int x = 10;
    void display(){
        // No error in accessing the instance variable, since 
        // display is not a static method.
        System.out.println(x);
    }
    public static void main(){
        // We cannot call nonstatic member inside a static block
        // display(); error

        Solution obj = new Solution();
        obj.display();
    }
}

class Solution2 {
    int x = 10;
    void display(){
        int x = 21;
        System.out.println(x); // prints 21; local var over instance var.

        // To refer to the instance variable, we need to use this reference. 
        System.out.println(this.x); // prints 10;
    }

    public static void main(){
        Solution obj = new Solution();
        obj.display();

        Solution obj1 = new Solution();
        obj1.x = 15; // instance variable for obj1 is updated. 
        obj1.display(); 
    }
}