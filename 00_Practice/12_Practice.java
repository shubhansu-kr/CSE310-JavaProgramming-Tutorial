// WAP to create Banking Management System. 
// deposit();
// withdraw();
// Checkbalance();

import java.util.*;

class Solution {

    int balance;

    // Solution: Constructor
    Solution(){}
    Solution(int x){
        balance = x;
    }

    // Initialiser Block.
    {
        balance = 100;
    }

    void deposit(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter amount to deposit: ");
        int dep = sc.nextInt();

        balance += dep;
        System.out.println("Deposited Sucessfully\n");
    }

    void withdraw(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter amount to withdraw: ");
        int wdraw = sc.nextInt();
        if (wdraw > balance) {
            System.out.println("Insufficient Balance");
            System.out.println("Withdraw Aborted!\n");
        }
        else {
            System.out.println("Withdrawl Sucessfull\n");
        }
    }

    void checkBalance(){
        System.out.println("\nYour current balance is: " + balance + "\n");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int ch = -1;
        Solution obj = new Solution(2100);

        while(ch != 4){
            System.out.println("Bank: \n");
            System.out.println("1: Deposit\n2: Withdraw\n3: CheckBalance\n4: Exit\n");
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: 
                    obj.deposit();
                    break;
                case 2: 
                    obj.withdraw();
                    break;
                case 3: 
                    obj.checkBalance();
                    break;
                case 4: 
                    break;
                default: 
                    System.out.println("Enter Correct Choice");
                    break;
            }
        }
        System.out.println("\nEnd");
    }
}