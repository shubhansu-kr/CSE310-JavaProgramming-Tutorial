import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // All valid way to declare the array.
        int arr1[];
        int arr2 [];
        int []arr3;
        int [] arr4;

        // Only valid way to declare as well as initialise the array.
        int arr[] = {1, 3, 4, 2, 4};

        // Error: Cannot access the array which is nor initialised. 
        // arr1, arr2, arr3, arr4 are not initialised = gives error when we use arr1.length;
        // System.out.println(arr.length + " " + arr1.length + " " + arr2.length + " " + arr3.length + " " + arr4.length);

        // length is a variable member of array class.
        System.out.println(arr.length); // prints 5
        
        // Error : Not Initialised.
        // System.out.println(arr1.length);
        // System.out.println(arr2.length);
        // System.out.println(arr3.length);
        // System.out.println(arr4.length);

        // System.out.println(arr1); Error : Not initialised.

        // Initialise with new keyword. 
        // We can initialise the array with size zero.
        arr1 = new int[0];
        System.out.println(arr1.length); // prints 0
        System.out.println(arr1); // prints the address of arr1

        // Error : Index out of bound 
        // System.out.println(arr1[0]); 
        // System.out.println(arr1[1]);
    }
}