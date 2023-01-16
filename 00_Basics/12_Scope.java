import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // local variable must be initialised or if not initialised must 
        // not be accessed. 
        int i;

        // Compile time error: We cannot access an uninitialised local variable.
        // System.out.println(i);

    }
}

class Solution1 {

    // Constant variable : Use keyword 'final';
    // const variable must be initialised. 

    final int i = 21;
    final int j = 15;

    // int final j = 15; : We cannot interchange data type and integer.
    // final int k; : throw error since we are not initialising a const var.

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        System.out.println(new Solution().i);
        System.out.println(new Solution().j);
    }
}