import java.util.*;

class Solution {

    static void converToInt(double nums[]){
        for(int i = 0; i < nums.length; ++i){
            nums[i] = (int)(nums[i]);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Passing Array as an argument in the method
        // Objects and Arrays are passed as refrence. 

        double nums[] = {1.221, 32.43, 2.4, 4.32, 42.342};
        converToInt(nums);
        for(double it: nums){
            System.out.print(it + " ");
        }

        // The double is printed in 20.0 if there are no decimal. 
        System.out.println();
        double p = 20;
        System.out.println(p);
    }
}