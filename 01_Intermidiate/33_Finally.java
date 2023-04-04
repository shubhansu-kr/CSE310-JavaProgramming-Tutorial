// Finally in Java

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        // finally block is executed even if no exception is thrown. 

        // try + catch + finally : Allowed : No error
        // if exception both catch and finally are executed.
        // if no exception finally is  executed
 
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;
            System.out.println(c);
        } catch(Exception e) {
            System.out.println(e);
            System.out.println("Inside catch block 1");
        } finally {
            System.out.println("Inside finally 1");
        }

        // try + catch : No Error
        // No exception: finally block is executed  and program continues to execute
        // Exception: finally block is executed and program terminates.
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;
            System.out.println(c);
        } finally {
            // if exception, program terminates afeter execution of this block
            System.out.println("Inside finally 2");
        }

        // Try + finally + catch : Error : Not allowed
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;
            System.out.println(c);
        } finally {
            System.out.println("Inside finally 3");
        } 
        // Multiple finally block is not allowed.
        // finally {

        // }
        // catch(Exception e) {
        //     System.out.println(e);
        //     System.out.println("Inside catch block 2");
        // } error.
        
    }
}