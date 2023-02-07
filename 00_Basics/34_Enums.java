// Enums in Java

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ReqStatus r = ReqStatus.PENDING;
        System.out.println(r);

        switch (r) {
            case PENDING:
                System.out.println("0");
                break;
            case RUNNING: 
                System.out.println("1");
                break;
            default: 
                System.out.println("def");
                break;
        }

        // Enums can be traversed using the values method.
        for(ReqStatus s: ReqStatus.values()){
            System.out.println(s);
        }

        // Values() : Returns an iterable list of all the constants in the enum
        System.out.println(ReqStatus.values());

        // Enum: 
        // Group of constants. 
        // all the user defined enums class are internally inheriting the 
        // Enum class(Java.lang.enum) from library(Java.lang) which includes default methods like 
        // values(), getClass(), etc.
        // We cannot use new keyword with enum because it has private constructor
        // only.

    }
}

// All the enum member variable are final(const), static by default(implicitly)

// Syntax: 
// enum {
//        Your Constant goes here(seprated by comma);
// }

enum ReqStatus{
    PENDING, RUNNING, REJECTED, WAITING, RESOLVED;
}