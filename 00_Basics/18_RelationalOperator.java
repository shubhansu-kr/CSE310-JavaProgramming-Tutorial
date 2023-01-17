import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));


        // We can concatinate logic to string but not to int. To be Noted.
        System.out.println("Logic: " + false);

        if (true) {
            System.out.println("Logic: " + true);
        }
        if (!true) {
            System.out.println("Logic: !true");
        }
        else {
            System.out.println("Logic: !true: else");
        }
    }
}

class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        a = 10;

        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is : " + b);
        
        b = (a == 10) ? 20: 30;
        System.out.println("Value of b is : " + b);

    }
}