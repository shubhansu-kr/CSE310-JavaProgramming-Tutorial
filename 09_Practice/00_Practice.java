import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n < 2 || n > 999 || k < 2 || k > 99) {
            System.out.println("Invalid Input");
            return;
        }

        if (n % k == 0) {
            System.out.println("Multiple");
        }
        else {
            System.out.println("Not Multiple");
        }
    }
}