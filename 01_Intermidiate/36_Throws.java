// Throws Exception: Declare exception :-> Let the caller handle the function. 

import java.util.*;

class InvalidMarksException extends Exception {
    String errorMessage;

    InvalidMarksException(){}
    InvalidMarksException(String message) {
        super(message);
        // Use your own message variable or use parent class's variable
        this.errorMessage = message;
    }

    String errorMessage() {
        System.out.println("Error Message method called");
        return super.getMessage();
        // return this.errorMessage;
    }

    // overwrite get message 
    public String getMessage(){
        System.out.println("Overwritten getMessage method");
        return this.errorMessage;
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    static int getSubject() throws ArithmeticException {
        System.out.print("Enter the number of subject: ");
        int n = sc.nextInt();
            
        if (n > 5 || n < 1) {
            // Throws exception to be handled by main.
            throw new ArithmeticException("Number of subject cannot be less than 1 or more than 5");
        }

        return n;
    }

    static int[] getMarks(int n) throws InvalidMarksException {
        int marks[] = new int[n];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks" + i + " : ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                // to be handled in main func.
                throw new InvalidMarksException("Marks cannot be less than 0 or greater than 100");
            }
        }

        return marks;
    }

    public static void main(String args[]){
        int marks[];
        int n;
        
        // Arithemetic exception are unchecked exceptions, we do not need 
        // to handle them explicitly.
        n = getSubject();

        try{
            n = getSubject();

            // invalidmarksexception are checked exception cannot be outside
            // try block.
            marks = getMarks(n);

            for (int i = 0; i < n; i++) {
                System.out.println(marks[i]);
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