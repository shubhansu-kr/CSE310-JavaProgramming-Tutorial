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

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        hello: 
        for(int a = 1; a < 3; a++){
            System.out.println("Hell");
            int i = 1;
            if (i == 1) break hello;
        }

        // output: hell 
    }
}

class Solution2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = 5; 
        outer: 
        for(int a = 1; a < 5; a++){
            int i = 0, j = 0;
            System.out.println();
            space: 
            while(true){
                System.out.println(" ");
                i++;
                if (i == n-a) break space;
            }
            star:
            while(true) {
                System.out.println(" * ");
                j++;
                if (j == a) continue outer;
            }
        }
    }
    // output: Series of "*" 
}