import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Data Types: 
        /* 
            byte   = 8
            short  = 16
            int    = 32
            long   = 64
            float  = 
            double
            char   = 16
            boolean
        */

        byte b = 127;
        System.out.println(b);

        short s = 2431;
        System.out.println(s);

        int i = 212211;
        System.out.println(i);

        long l = 32121324;
        System.out.println(l);

        // f is mandatory, By default the decimal values are considered to be double. 
        float f = 21.3f;
        System.out.println(f);

        float f1 = 21; // f is not necessary if we do not have decimal digits. 
        System.out.println(f1);

        double d = 21.323;
        System.out.println(d);
    }
}

class Solution1 {
    public static void main (String ...args) {
        // Type conversion Errors: 

        // Whenever we operate any variable, it is implicitly converted into int. 
        byte b1 = 21;
        byte b2 = 15;

        // byte b3 = b1 * b2; // Error
        // Here, the compiler converts the b1 and b2 into int data type 
        // So when we assign int to byte b3 we get an error. 

        // To Resolve the error, we need to explicitly convert the int into byte. 
        byte b3 = (byte)(b1 * b2);
        System.out.println(b3); // 59.

        // Same goes for short data type.(All the data types which have range less than int)
        // byte b4 = b1 * 10; : Error 

        byte b4 = 10 * 10; // No error since we are not involving any variables in operation. 
        System.out.println(b4);


        // When we type case any number explicitly from one data type to another and if the number is 
        // out of range, the number is cycles back to the least number. 

        // eg range of byte is -127 to 128 
        // if we store 128 explicitly in byte: -127 will be stored and 130 will be stored as -126. 
        byte b5 = (byte)(130);
        System.out.println(b5); // Prints -126. 
    }
}

class Solution2 {
    public static void main(String args[]){
        
        // Float and Double Precision :
        float f1 = 21.123456789f;
        System.out.println(f1); // Round off to 6 digits: 

        double d1 = 21.123456789012345678;
        System.out.println(d1);  // 15 digits 
    }
}