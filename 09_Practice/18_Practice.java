// Demo

import java.util.*;


class Demo{

    int a, b;

    // Initialiser value;
    {
        a = 21; 
        b = 15;
    }

    Demo(){
        System.out.println("Print: " + a + " " + b);

    }
    Demo(int a){
        this.a += a;
        System.out.println("Print: " + this.a + " " + this.b);
    }
    Demo(int a, int b){
        this.a += a;
        this.b += b;
        System.out.println("Print: " + this.a + " " + this.b);
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(21);
        Demo obj3 = new Demo(21, 15);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}