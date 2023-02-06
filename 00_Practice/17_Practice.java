// Wap to Reverse the array

import java.util.*;

class Solution {

    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
            // swap(arr[i++], arr[j--]);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Before Swap: ");
        for(int it: arr){
            System.out.print(it + " ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.print("After Swap : ");
        for(int it: arr){
            System.out.print(it + " ");
        }

    }
}