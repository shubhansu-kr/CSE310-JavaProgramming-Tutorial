// Exception in Java

// An exception is a run-time errors.

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(args[i+1]) == 0) zeroCount++;
                else if (Integer.parseInt(args[i+1]) > 0) positiveCount++;
                else negativeCount++;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception raised at block 1");
        }

        System.out.println(zeroCount + " " + positiveCount + " " + negativeCount);
    }
}

class Solution1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
        // Exceptions are thrown by JVM or Programmer. 
        int x = sc.nextInt();
        int y = sc.nextInt();

        // int z = x/y; // An arithemetic exception is thrown by JVM if y is 0.

        // Exception handling keywords. 
        // try
        // catch
        // throw
        // throws 
        // finally

        // Try is used to enclose the code which we know might throw an exception
        // to catch the exception.

        int z = -1;
        try {
            z = x/y;
        }
        // Reference different types of exception.
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Know your limits");
        }
        catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("Dont divide by 0");
        }
        // We are trying to catch the exception and we need to store the 
        // reference of it. 
        // Exception class obj is used to catch the exception reference.
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Do as it says");
        }


        System.out.println(z);
    }
}