// 2D dynammic array

import java.util.*;

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Two-D array in Java

        // In java - Elements of One-D arrays are located at contiguous memory location but
        // two one D array constituting a 2-D array need not to be contiguous. 

        // int arr[][] = {
        //                 {1, 2, 3}, 
        //                 {4, 5, 6}, 
        //                 {7, 8, 9}
        //                 };

        // Column Majors : When all the elements are stored column wise.
        // Col Major seq : 1, 4, 6, 2, 5, 8, 3, 6, 9 ;
        // Row Major seq : 1, 2, 3, 4, 5, 6, 7, 8, 9 ;

        // Fixed Size: Initialised with default val 0;
        int arr[][] = new int[4][5]; 

        // Variable Columns Size initialisation | Fixed no. of rows.
        int arr1[][] = new int[5][];
        
        // Using one-D array to initialise the 2D array: Size decided by oneD Array size.
        int oneD1[] = new int[3];
        int oneD2[] = new int[15];
        int oneD2[] = new int[10];

        int arr2[][] = {oneD1, oneD2, oneD3};

        // Using Values to initialise while declaration: 
        int arr3[][] = {{2,4,3}, {3, 2}, {4,2,3,43,34,3}, {4,3,4,3,43,43,5,4}};

    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Create a 4*5 2d Array
        int marks[][] = new int[4][5];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 5; ++j){
                // All default val 0;
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Create Dynammic size array 

        // 4 Students : Each have different numbers of subjects.
        int marks1[][] = new int[4][];

        for(int i = 0; i < 4; ++i){
            int size ;
            System.out.print("Enter No. of Subjects for student " + (i+1) + " : ");
            size = sc.nextInt();
            marks1[i] = new int[size];
            for(int j = 0; j < size; ++j) {
                System.out.print("Enter marks of sub "+ (j+1) + " : ");
                marks1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < marks1[i].length; ++j){
                // All default val 0;
                System.out.print(marks1[i][j] + " ");
            }
            System.out.println();
        }


        // Or initialise while declaration.
        int marks2[][] = {{2, 4}, {3, 2, 5, 3, 5}, {3, 2, 4}, {2, 4}};
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < marks2[i].length; ++j){
                // All default val 0;
                System.out.print(marks2[i][j] + " ");
            }
            System.out.println();
        }
    }       
}