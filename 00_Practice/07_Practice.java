import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        outer:
        for(int i = 0; i < 3; ++i){
            inner: 
            for(int j = 0; j < 3; ++j){
                System.out.println(i + ", "+j);
                if (j == 2) break inner;
                if (i == j) continue outer;
                System.out.println("Bye");
            }
        }

        // Output: 
        // 0, 0
        // 1, 0
        // Bye
        // 1, 1
        // 2, 0
        // Bye
        // 2, 1
        // Bye
        // 2, 2
    }
}