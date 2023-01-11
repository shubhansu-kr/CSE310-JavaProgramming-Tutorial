// To use the input function we need to import the scanner class 
// util library has the scanner class.

import java.util.*;

class Solution {
    public static void main (String args[]){
        // Input 
        // First create an instance of scanner class 

        Scanner sc = new Scanner(System.in);

        // To scan input of different datatypes we have differnt methtods 

        // nextInt() : takes integer input 
        System.out.print("Enter integer: ");
        int i = sc.nextInt();

        // nextFloat() : takes float input 
        System.out.print("Enter float: ");
        float f = sc.nextFloat();

        // nextDouble() : takes double input 
        System.out.print("Enter double: ");
        double d = sc.nextDouble(); 

        // nextLong() : takes double input 
        System.out.print("Enter Long: ");
        long l = sc.nextLong(); 


        // Sometimes the console takes the input from the buffer. To
        // avoid such situation we clear the buffer beforehand 
        sc.nextLine();
        
        // nextLine() : takes the input of whole line 
        System.out.print("Enter line: ");
        String str = sc.nextLine();

        // next() : takes the input of one word
        System.out.print("Enter word: ");
        String w = sc.next();

        // next().charAt(0): takes input of one character
        System.out.print("Enter Character: ");
        char c = sc.next().charAt(0);

        System.out.print("This line is printed using system.out.print \n");
        System.out.print(f + " " + i + " " + l + " " + d + " " + str + " " + w + " " + c + "\n");
    }
}