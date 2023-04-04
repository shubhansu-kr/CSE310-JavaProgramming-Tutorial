// Custom Exception class

import java.util.*;

class InvalidMarksException extends Exception {
    String errorMessage;

    InvalidMarksException(){}
    InvalidMarksException(String message) {
        super(message);
        // Use your own message variable or use parent class's variable
        // this.errorMessage = message;
    }

    String errorMessage() {
        return super.getMessage();
        // return this.errorMessage;
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int marks[];
        int n;

        try{
            System.out.print("Enter the number of subject: ");
            n = sc.nextInt();
            
            if (n > 5 || n < 1) {
                throw new ArithmeticException("Number of subject cannot be less than 1 or more than 5");
            }

            marks = new int[n];

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter marks" + i + " : ");
                marks[i] = sc.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new InvalidMarksException("Marks cannot be less than 0 or greater than 100");
                }
            }
        
        }
        catch (InvalidMarksException e) {
            e.errorMessage();
            e.getMessage();
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }   
    }
}