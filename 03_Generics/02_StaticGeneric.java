// Generic * static

import java.util.*;

class A<T> {

    T id;

    // Error: 
    // Cannot make a static reference to the non-static type T
    // static T id = 1;

    A(T id){
        this.id = id;
    }
    
    <x>T getSum(){
        T temp = this.id;
        
        // x is generic specific to this method only
        x ob;

        return temp;
    }

}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        A<Integer> obj = new A<Integer>(21);

        System.out.println(obj.<Integer>getSum());
    }
}