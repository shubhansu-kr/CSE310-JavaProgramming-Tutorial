/*
WAP to create a class Examination having data members
	-Name,reg,subject1,subjet2,subject3
	-double tgpaCalc()
	-show()
Take the input of Data members from User and intialise the same through contructor
and return the calculated  tgpa of student through the tgpa() method  and also show th basic detail like name and reg through show method
*/

import java.util.*;

class Solution {

    String name;
    int reg;
    double sub1, sub2, sub3;
    double tgpa;

    Solution(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();
        
        System.out.print("Enter regNo: ");
        reg = sc.nextInt();
        
        System.out.print("Enter sub1 Marks: ");
        sub1 = sc.nextFloat();
        
        System.out.print("Enter sub2 Marks: ");
        sub2 = sc.nextFloat();
        
        System.out.print("Enter sub3 Marks: ");
        sub3 = sc.nextFloat();
    }

    void display(){
        System.out.println("Name: " + name + "\tregNo: " + reg);
        System.out.println("Sub1: " + sub1 + "\tSub2: " + sub2 + "\tSub3: " + sub3);
        System.out.println("TGPA: " + tgpa);
    }

    void calculateTGPA(){
        // Assuming the percentage to be 9.5 times the tgpa.
        double percentage = (sub1/3.0 + sub2/3.0 + sub3/3.0);
        tgpa =percentage/9.5;

        // ternary operator returns the value rather than evaluation the expression.
        tgpa = tgpa > 10 ? 10 : tgpa;
        // if (tgpa > 10){
        //     tgpa = 10;
        // }
    }

    public static void main(String args[]){
        Solution obj1 = new Solution();
        obj1.calculateTGPA();
        obj1.display();
    }
}