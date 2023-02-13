// Function Overloading

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    int [][] marks;

    void evaluation(int [][] marks){
        this.marks = marks;
    }

    int [][] evaluation() {
        int [][] bestMarks = new int[3][2];

        for (int i = 0; i < 3; i++) {
            int max = -1, max1 = -1;
            for (int j = 0; j < 4; j++) {
                if (max < marks[i][j]) {
                    max1 = max;
                    max = marks[i][j];
                }
                else if (max1 < marks[i][j]) {
                    max1 = marks[i][j];
                }
            }

            bestMarks[i][0] = max1;
            bestMarks[i][1] = max;
        }

        return bestMarks;
    }

    public static void main(String args[]){
        
        Solution Obj = new Solution();

        int marks[][] = {{76, 45, 67, 45}, {43, 65, 87, 65}, {89, 98, 67, 90}};
        Obj.evaluation(marks);

        int bestMarks[][] = Obj.evaluation();
        
        for(int x[]: bestMarks){
            for(int it: x) {
                System.out.print(it + " ");
            }
            System.out.println();
        }


    }
}