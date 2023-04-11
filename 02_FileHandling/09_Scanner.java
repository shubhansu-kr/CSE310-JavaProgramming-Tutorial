// Scanner Class File input

import java.io.File;
import java.util.*;

class Solution {
    // static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        File f = null;
        Scanner sc;

        // Read from file and print on console.
        try {
            f = new File("dummy.txt");
            sc = new Scanner(f);

            try {
                while(true){
                    System.out.println(sc.nextLine());
                }
            } catch (Exception e) {
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}