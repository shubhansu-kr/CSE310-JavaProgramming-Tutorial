// WAP to create a class e wallet having data member  
// name,balance amount, 
// take the input of name and balance amount from user 
// initialize the data member through constructor and 
// display the e wallet detail through show function.

import java.util.*;

class Solution {
    String name;
    float bal;

    // Just like we have default constructors in c++ as long as we do not
    // create out custom constructor. 
    // Once we have created our own constructor, we have to handle each 
    // possible parameter or at least default constructor with no parameter.
    Solution(){};
    Solution(String name, float bal){
        System.out.println("Inside Constructor1");
        this.name = name;
        this.bal = bal;
    }

    void display(){
        System.out.println(this.name + " " + this.bal);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Solution obj1 = new Solution();
        Solution obj2 = new Solution(sc.next(), sc.nextFloat());

        obj2.display();
    }
}