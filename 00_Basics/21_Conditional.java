import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int age = 18;

        if (age < 18) {
            System.out.println("GO home");
        }
        else if (age == 18) {
            System.out.println("Sweet");
        }
        else {
            System.out.println("Go Ahead");
        }

        int i = 10, j = 11, k = 121, a = 1, b = 2, c = 3, d = 4;
        if (i == 10){
            if (j < 20) a = b;
            if (k > 100) c = d;
            else a = c;
        }

        System.out.println(a + " " + b + " " + c + " " + d + " " + i + " " + j + " " + k);
    }
}