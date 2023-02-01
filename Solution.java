// WAP To swap two number using function

import java.util.*;

class Solution {

    int a, b;

    void swap(){
        int temp = a;
        a = b;
        b = temp;
    }

    void display(){
        System.out.println(a + " " + b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Solution obj = new Solution();
        obj.display();
        
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        obj.display();
        obj.swap();

        obj.display();
    }
}