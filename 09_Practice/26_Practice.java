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

    class Loan {

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
            System.out.println("Bank: " + name + " Interest: " + interest);
        }
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.setName("SBI");

        // L1, L2, L3 are three instances of loan of same bank Bk.
        Bank.Loan L1 = B1.new Loan();
        Bank.Loan L2 = B1.new Loan();
        Bank.Loan L3 = B1.new Loan();

        // L4 and L5 are two instance of loan of two different instance of bank.
        Bank.Loan L4 = new Bank("UBI").new Loan();
        Bank.Loan L5 = new Bank("RBI").new Loan();

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