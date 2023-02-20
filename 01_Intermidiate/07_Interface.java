// Interface

import java.util.*;

class Area51 {
    void area(int a) {
        int area = a * a;
        System.out.println("Area of square is : " + area);
    }

    void area(int a, int b) {
        int area = a * b;
        System.out.println("Area of rectange is : " + area);
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Area51 Obj = new Area51();
        Obj.area(4);
        Obj.area(3, 2);
    }
}