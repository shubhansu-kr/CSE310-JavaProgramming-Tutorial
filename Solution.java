import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num[] = {1,2,3,4,5};
        int sum = 0;

        for(int i: num){
            System.out.print(i + " ");
            sum += i;
            i++; // not updated in the array. i is a copy of original element.
        }
        System.out.print("\n"+ sum + "\n");

        for(int i: num){
            // Values are not updated in the array. 
            System.out.print(i + " ");
            // sum += i;
            // i++;
        }
    }
}