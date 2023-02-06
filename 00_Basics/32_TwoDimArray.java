// 2D dynammic array

import java.util.*;

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