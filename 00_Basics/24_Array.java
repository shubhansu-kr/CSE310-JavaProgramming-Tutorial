import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        // Dynammic allocation of matrix.
        int nums[][] = new int[3][5];
        int nums1[][] = new int[5][5];
        
        // initialise value in matrix
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; ++j){
                nums[i][j] = i+j;
            }
        }

        // Initialise the values in matrix
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; ++j){
                nums1[i][j] = i*i+j*j;
            }   
        }

        for(int it[]: nums){
            for(int i: it){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Solution1 {
    // One Dimensional Array.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // All valid declaration
        int []nums1;
        int[] nums2;
        int nums3[];
        int nums4 [];

        int nums[] = new int[5];
        
        // Error: No static allocation of memory in java. 
        // int nums5[5];

        // We can initialise with values. 
        int nums5[] = {1,4,5,3,2};

        // Error: We cannot use numbers with []. No matter what.
        // int nums6[5] = {1,4,5,3,2}; // error.

        // Access elements.
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;

        for(int it: nums){
            System.out.println(it);
        }
    }
}

class Solution2 {
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