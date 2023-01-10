class Solution {
    
    static int i = 21; // instance var

    public static void main(String ... args) {
        int i = 15;
        
        // Local variable takes the priority. 
        // print i = 15;
        System.out.println(i);

        // Calling instance memeber using class name 
        // prints i = 21;
        System.out.println(Solution.i);
    }
}

class Solution1 {

    public static void main (String ... args) {
        // Error: Cannot use static with local variable. 
        // Illegal start of the expression. 
        // static int i = 21; 
        
        System.out.println(i);
    }
}