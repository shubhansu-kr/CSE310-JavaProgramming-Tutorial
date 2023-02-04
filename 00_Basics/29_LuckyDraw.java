// WAP to create a lucky draw where user draws between 1 and 20 out of which only one is winner.

import java.util.*;

class Solution {

    static int winner, counter;

    static boolean draw(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num to Draw between (1 <= n <= 20): ");
        int num = sc.nextInt();

        if (num == winner) return true;
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        boolean game = true;

        while(game){
            
            winner = ((int)(Math.random()))%20 + 1;
            System.out.println("-- Lucky Draw --\n");
            System.out.println("Choose Option:");
            System.out.println("1: Draw");
            System.out.println("2: Exit");

            int choice;
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                counter++;
                if (draw()){
                    System.out.println("Congratulations! You won the draw in " + counter);
                    break;
                }
                else {
                    System.out.println("Better Luck Next Time\n");
                }
            }
            else if (choice == 2) {
                game = false;
            }
            else {
                System.out.println("Enter valid Choice");
            }
        }

        if (game == false) {
            System.out.println("\nLucky number was: " + winner);
        }
        System.out.println("Bye");
    }
}