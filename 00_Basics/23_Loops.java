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

class Solution2{
    static public void main(String args[]){
        
        int A[] = {2, 4, 3, 2, 4, 2};
        
        // For each loop 
        // Syntax: for(int var: iterable){}
        for(int i: A){
            System.out.println(i);
        }
    }
}

class Solution3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num[] = {1,2,3,4,5};
        int sum = 0;

        for(int i: num){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.print("\n"+ sum);
    }
}

class Solution4 {
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
