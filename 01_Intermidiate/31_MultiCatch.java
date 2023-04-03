// Practice : Take command line argument 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int lower = 0, upper = 0;
        try {
            lower = Integer.parseInt(args[0]);
            upper = Integer.parseInt(args[1]);

            if (lower >= upper) {
                throw new Exception("Lower >= upper");
            }
        }
        // Multi catch : Use pipes to catch multiple types of exception.
        catch (IndexOutOfBoundsException | InputMismatchException | NumberFormatException  e) {
            if (e instanceof IndexOutOfBoundsException) {
                System.out.println(e);
                System.out.println("Know your limits");
            }
            else if (e instanceof InputMismatchException) {
                System.out.println(e);
                System.out.println("Apple Oranges");
                System.out.println("Wolf in sheep's clothing");
            }
            else if (e instanceof NumberFormatException) {
                System.out.println(e);
                System.out.println("Apple Oranges");
                System.out.println("Swords can't be made from rocks.");
            }
            else {
                System.out.println(e);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        for (int i = lower; i < upper; i++) {
            System.out.println(i);
        }


        // String Index out of bound Exception.
        try {
            System.out.println("Hello".substring(0, 10));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Limits");
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Exception Raised");
        }
    }
}