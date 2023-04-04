// Throw in java 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        // Throw is used to create a programmer defined exception
        // Explicit throw of exception.

        while(true) {            
            try
            {
                System.out.print("a : ");
                int a = sc.nextInt();
                System.out.print("b : ");
                int b = sc.nextInt();
                
                if (a < b) {
                    throw new Exception("a cannot be less than b");
                }
                
                int c = a/b;
                System.out.println(c);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("You are supposed to pass integer");
                System.out.println();
            }
            catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("we cannot divide by 0");
                System.out.println();
            }
            catch (Exception e) {
                System.out.println(e);
                System.out.println();
            }   
        }


    }
}