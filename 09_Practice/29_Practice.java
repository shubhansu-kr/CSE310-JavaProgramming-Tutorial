// A class Bank with an abstract method processLoan(). Create an anonymous class giving 
// definition to the abstract method.

import java.util.*;

@FunctionalInterface
interface Loan{
    void processLoan();
}

class Bank implements Loan{
    public void processLoan() {
        System.out.println("Sorry, Your loan is rejected!");
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Bank Obj = new Bank();
        Loan obj1 = new Loan() {
            public void processLoan() {
                System.out.println("Congratulation! you loan is approved");
            }
        };

        Obj.processLoan();
        obj1.processLoan();
        
    }
}