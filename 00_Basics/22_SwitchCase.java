import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 10; ++i) {
            switch (i) {
                case 0: 
                    System.out.println("i is zer0");
                    break;
                case 1: 
                    System.out.println("i is one");
                    break;
                case 2: 
                    System.out.println("i is two");
                    break;
                case 3: 
                    System.out.println("i is three");
                    break;
                default: 
                    System.out.println("i greater than 3");
                    break;
            }
        }
    }
}