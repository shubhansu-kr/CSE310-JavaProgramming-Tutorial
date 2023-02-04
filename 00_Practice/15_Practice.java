import java.util.*;

class Solution {
    // Roll a dice 10 times and record the output
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int dice[] = new int[10];
        for(int i = 0; i < 10; ++i){
            
            // Math.random() : return double between 0 to 1
            dice[i] = ((int)(Math.random()*10))%6 + 1;
        }

        for(int it: dice){
            System.out.print(it + " ");
        }
    }
}