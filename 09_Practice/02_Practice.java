import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = 10, y = 5;
        while(x-- > 7 || ++y < 8)
        System.out.println(x); // considered a part of loop
        System.out.println(y); // 8

    }
}