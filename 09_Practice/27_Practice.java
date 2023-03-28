// Nested Class : Implementation.

import java.util.*;

class Bank {
    String name;

    Bank() {
        System.out.println("Bank Constructor Default");
    }
    Bank(String name) {
        System.out.println("Bank Constructor.");
        this.name = name;
    }

    {
        name = "";
    }

    void setName(String name){
        this.name = name;
    }

    // Error: On Static Class.

    static class Loan {

        Loan() {
            System.out.println("Loan Constructor");
        }

        {
            interest = 0;
        }

        double interest;
        
        void setInterest(double d) {
            this.interest = d;
        }

        void display() {
            // System.out.println("Bank: " + name + " Interest: " + interest);
            System.out.println("Interest: " + interest);
        }
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.setName("SBI");

        Bank.Loan L1 = new Bank.Loan();
        Bank.Loan L2 = new Bank.Loan();
        Bank.Loan L3 = new Bank.Loan();

        Bank.Loan L4 = new Bank.Loan();
        Bank.Loan L5 = new Bank.Loan();

        L1.setInterest(3.75);
        L2.setInterest(2.98);
        L3.setInterest(3.22);
        L4.setInterest(3.62);
        L5.setInterest(3.44);

        L1.display();
        L2.display();
        L3.display();
        L4.display();
        L5.display();
        
    }
}