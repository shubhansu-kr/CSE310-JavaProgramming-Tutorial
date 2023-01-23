import java.util.*;

class Solution {
    // Two Dimensional Array
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Only valid declaration 
        int [][] arr;
        int arr1 [][];
        int [][]arr2;
        int arr3[][];

        // Error: Illegal initialisation of array. 
        // arr = {{1, 2}, {3, 4}};

        // We can initialise array with values only during the declaration.
        int arr4[][] = {{1, 2}, {3, 4}};
        
        // Allowed to dma after declaration.
        arr = new int[2][2];

        // Again error: Cannot initialise 
        // arr = {{1, 2}, {3, 4}};

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; ++j){
                arr[i][j] = i+j;
            }
        }
    }

}