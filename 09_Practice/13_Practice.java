// WAP to declare an array of size 5. 

import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        for(int it: arr){
            // Default value of array elements is zero.
            System.out.print(it + " Enter val: ");
            it = sc.nextInt();
            System.out.println(it);
        }

        for (int i: arr) {
            // Not updated in the array.
            System.out.println(i);
        }
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Use normal for loop
        int mark[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter marks: ");
            mark[i] = sc.nextInt();

            // Give grace marks
            mark[i] += 5;
        }

        for(int it: mark){
            System.out.println(it);
        }

        // We can use .length to find the length of array
        // It is a variable not a method. We cannot call length fxn;
    }
}

