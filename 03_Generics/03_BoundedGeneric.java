// Bounded Generic in Java

import java.util.*;


// Here, we have bounded the T2 generic types, and it will only
// accept data types which are included in Number class.
// Number class includes: Integer, Byte, Short, float, double, long

// So T1 can assume any data type but T2 has boundaries.
class A<T1, T2 extends Number> {
    T1 name;
    T2 id;

    A(){}
    A(T1 a, T2 b){
        name = a;
        id = b;
    }

    void displayTypes() {
        System.out.println(name.getClass().getName() + " " + id.getClass().getName());
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        // Error: We cannot specify T2 outside Normal scope
        // A<String, String> obj = new A<String, String>();

        // Allowed.
        A<String, Integer> obj = new A<String, Integer>("Shubh", 21);

        obj.displayTypes();
    }
}