// Multiple generic 

import java.util.*;

class Parent<T1, T2> {
    T1 name;
    T2 id;

    void set(T1 name, T2 id) {
        this.name = name;
        this.id = id;
    }

    T1 getName() {
        return this.name;
    }

    T2 getId() {
        return this.id;
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        // Parameterised Initialisation of Obj.
        Parent<String, Integer> obj = new Parent<String, Integer>();

        // Set values of obj.
        obj.set("Shubh", 21);

        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}