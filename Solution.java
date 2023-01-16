import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float silverRate = sc.nextFloat();
        float goldRate = sc.nextFloat();

        sc.nextLine();
        
        String choice = sc.nextLine();
        float weight = sc.nextFloat();


        if (weight < 0.01 || weight > 1000 || silverRate < 0 || goldRate < 0 || silverRate > 1000000 || goldRate > 10000000) {
            System.out.println("Invalid Input");
            return;
        }

        if (choice == "Silver") {
            System.out.println(weight * silverRate / 1000);
        }
        else {
            System.out.println(weight * goldRate / 10);
        }
    }
}