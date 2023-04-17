// Generic in Java

import java.util.*;

// Create a generic template t
class Registration<T> {
    T id;
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Registration obj = new Registration();

        // We have not specified the type of obj, so it can take any type
        // T is of object type(Parent of all data types).

        obj.id = 231321;
        System.out.println(obj.id);

        obj.id = "Lost";
        System.out.println(obj.id);

    }
}