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