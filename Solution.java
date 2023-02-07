// Enums in java

import java.util.*;

enum Laptops {

    // Each Constant of enum acts as an instance of the class.
    MAC(2500), XPS(1200, 2), HP(300), SURFACE(1800, 5), THINKPAD(1600);

    int p;

    // All the instance of the Laptops can be initialised using constructors only.
    // These constructors are private by default. 
    // So we need not to pass any argument in main.
    Laptops(int price){
        p = price;
    }

    // We can access each instance using methods.
    int displayPrice(){
        return p;
    }

    // Overload constructor to add a multiplier to the price.
    Laptops(int price, int multiplier) {
        p = price * multiplier;
    }

    // Default Constructor
    Laptops(){}

    // Setter Function
    void setPrice(int price, int mul) {
        p = price * mul;
    }
}

class Solution {

    // function overloading
    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a) {
        return a + 1;
    }

    static void pr(){
        System.out.println("Print1");
    }
    static void pr(int a){
        System.out.println("Print2");
    }

    // Create enum inside Solution class.
    public enum Week{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Traverse.
        for(Week wk: Week.values()) System.out.print(wk + " ");
        System.out.println();

        // Ordinal Method: Returns the index of constant.
        Laptops lp = Laptops.HP;
        System.out.println(lp.ordinal()); // Prints 2;

        for(Laptops l: Laptops.values()){
            System.out.print(l.ordinal() + " "); // 0,1,2,3,4,5
        }
        System.out.println();

        for(Laptops l: Laptops.values()){
            System.out.print(l.displayPrice() + " "); // Prints price of each laptop.
            l.setPrice(32, 0); // Sets the price to zero for each constant.
        }
        System.out.println();

        for(Laptops l: Laptops.values()){
            System.out.print(l.displayPrice() + " "); // 0 0 0 0 0
        }

        System.out.println(add(3));
        System.out.println(add(3, 4));

        pr();
        pr(40);
    }
}