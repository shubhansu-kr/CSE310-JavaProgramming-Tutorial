import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        char a = 'G';
        while(n > 0) {
            System.out.println(a);
            n--;
            a++;
        }
    }
}


class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n;
        int x = 5;
        for(n = 1; n <= 10; n++) {
            int p = x * n;
            System.out.println(p);
        }
    }
}