class Solution {

    public static void main (String args[]){
        int i;  // local var

        // Error: If we print an uninitialised variable, we get error 
        // System.out.println(i);

        i = 32;
        System.out.println(i); // Prints 32: 

        // public int j = 21;  // Gives error: we cannot use access specifiers with
        // local variable
    }
}

class Solution1 {
    // Instance Variables: They have a default value
    // Boolean: false, Char: Large val, Int: Large val...

    String name; // No error, ever if we dont initialise it. 
    int k = 21; 

    // We can create static instance variables to access without class instance
    static int j = 22;

    public static void main (String args[]){
        int i;  // local var

        // Error: If we print an uninitialised variable, we get error 
        // System.out.println(i);

        i = 32;
        System.out.println(i); // Prints 32: 

        // public int j = 21;  // Gives error: we cannot use access specifiers with
        // local variable

        // To print the instance member we have to use the instance or object 
        System.out.println(new Solution1().k);
        
        System.out.println("Ends"); // Prints 32: 

        // Here j is not local variable. 
        System.out.println(j); // Prints 22
    }
}
