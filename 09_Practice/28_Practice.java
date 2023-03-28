// A class Bank with an abstract method processLoan(). Create an anonymous class giving 
// definition to the abstract method.

import java.util.*;

abstract class Bank {
    abstract void processLoan();
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Bank obj1 = new Bank() {
            void processLoan() {
                System.out.println("Congratulation! you loan is approved");
            }
        };

        obj1.processLoan();
    }
}