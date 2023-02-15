// Inheritance

// Only one direct super class is allowed and unlimited number of childClass
// we have only one super class to avoid ambiguity from multiple inheritance

// used to create and organise reusable classes. 

// Transitive inheritance 
// if A -> B and  B -> C then A -> C automatically. 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
    }
}

class Shape {
    // closed figs.
}

class Rectangle extends Shape {
    // Every rectangle is a shape
}

class Square extends Rectangle {
    // Every square is a rectangle.
}