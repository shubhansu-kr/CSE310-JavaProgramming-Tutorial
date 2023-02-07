// Array Cloning in Java: Allocate + Iniitialise.

import java.util.*;

class Solution {

    static void add(int ... arr) {
        // use ... 'Three dot' to destructure.
        // arr can accept indivisual int variables or array refrence.
        System.out.println("IN ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = {{2, 4, 2}, {}, {3, 2, 5}};

        // Trying to cloning the typical way
        int arr1[][] = arr;
        // Here arr1 is just another reference to arr. No new memory 
        // is allocated. 

        // clone is a member function of array class. 
        // It allocated a new block of memory, copies the elements 
        // of arr into arr2 array.
        int arr2[][] = arr.clone();


        // If we are initialising any array with values during declaration
        // we may or may not include new keyword. Both will be valid

        int arr3[] = new int[]{1,2,3,4,5,5};
        int arr4[] = {1,2,3,4,5,6};
        // Both are valid.

        // Destructuring of parameters: We can pass array refrence or multiple var
        // including no parameter passing.

        
        // pass array ref
        add(arr3);
        // pass indivisual elements
        add(2, 4, 5, 3, 5);
        // pass nothing
        add();
        // pass variable
        int a = 21, b = 15, c = 13;
        add(a, b, c);
        // all valid

        
    }
}