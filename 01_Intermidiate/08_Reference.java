// Reference Variable: Method Overriding.

import java.util.*;

class Car {
    void drive() {
        System.out.println("Driving a slow car");
    }
}

class WagonR extends Car {
    // Overriding the inherited function.
    void drive() {
        System.out.println("Driving a wagonR");
    }

    void fly() {
        System.out.println("We are flying");
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        // cc is just a reference to the object created by the new Car().
        Car cc = new Car();
        cc.drive(); // calls the Car.drive();

        // wg is a reference to the created object of wagonr Class.
        WagonR wg = new WagonR();
        wg.drive(); // calls the WagonR.drive();

        // cg is a reference to the created object of wagonR class.
        Car cg = new WagonR();
        cg.drive();  // calls WagonR.drive();

        // We can use a reference of Parent class to refer to the object 
        // of child class.
        // but we can only call those  functions which are overridden by the 
        // child class.

        // It would give an error if we try to call any method which is not
        // overridden 

        // Error: Method fly undefined for the object java
        // cg.fly(); // error
        
    }
}