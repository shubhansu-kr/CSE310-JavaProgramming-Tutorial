import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int size ;
        System.out.print("Enter the number of students: ");
        size = sc.nextInt();

        if (size < 1 || size > 20) {
            System.out.println("Invalid Size Array");
            return;
        }

        int marks[] = new int[size+1];
        
        for(int i = 0; i < size; ++i) {
            System.out.print("Enter the marks of student " + i + " : ");
            marks[i] = sc.nextInt();
        }

        // Find the third highest marks 

        int max = -1, max1 = -1, max2 = -1;
        for(int it: marks) {
            if (it >= max){
                max2 = max1;
                max1 = max;
                max = it;
            }
            else if (it >= max1){
                max2 = max1;
                max1 = it;
            }
            else if (it >= max2) {
                max2 = it;
            }
        }

        if (max2 == -1) {
            System.out.println("No third highest");
            return;
        }
        System.out.println("The third Highest marks is: " + max2);
    }
}