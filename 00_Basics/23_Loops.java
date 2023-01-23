import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // For Loop 
        for(int i = 0; i < 10; ++i) {
            System.out.print(i);
        }
        System.out.println("");

        // while loop
        int i = 0;
        while(i < 10){
            System.out.print(i++);
        }
        System.out.println("");

        // do-while Loop
        i = 0;
        do {
            System.out.print(i++);
        } while (i < 10);
        System.out.println("");
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for(; true;){
            i++;
            if (i > 10) break;
            System.out.println(i);
        }
    }
}