// lamda expression in java

import java.util.*;

@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Shown");
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        A obj = new B();
        obj.show();
        
        // 3 byte files are created 
        // A.class B.class Solution.class

        // We can use anonymous class to avoid creation of byte codes
        A obj1 = new A(){
            public void show() {
                // Anonymous class 1
                System.out.println("Show1");
            }
        };

        obj1.show();

        // Lamda expression 
        A obj2 = () -> {
            System.out.println("This is a lamda expression");
        };

        obj2.show();
    }
}