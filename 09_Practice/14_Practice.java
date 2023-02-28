// WAP To swap two number using function

import java.util.*;

class Solution {

    // Logic Fails, because we are not passing the variable with arguments. 
    // Use instance var instead
    static void swap(int a, int b) {
        int temp = a; 
        a = b; 
        b = temp;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + " " + b);
        swap (a, b);
        System.out.println(a + " " + b);
    }
}

// Use Instance Var
class Solution1{
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
        
        Solution1 obj = new Solution1();
        obj.display();

        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        
        obj.display();
        obj.swap();
        obj.display();
    }
}