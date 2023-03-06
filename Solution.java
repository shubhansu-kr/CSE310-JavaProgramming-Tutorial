// Nested Class 

import java.util.*;

class Student {
    // Private Sub-Class
    private class Marks {
        // Inner Class : because it is nonstatic.

        // we dont need obj to call the non-static methods inside non-static class
        void show() {
            display();
        }
    }

    // Public Sub-Class : Static/Non-Static
    static public class Details {
        // static nested class. 
        void show() {
            System.out.println(name);
        }
    }

    static String name = "Shubh";
    void display() {
        System.out.println(name + "ansu");
    }

}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Student st = new Student();
        st.display();
        Student.Details obj = new Student.Details();
        obj.show();

        // Private not available. 
        // Student.Marks obj1 = new Student.Marks();
        
    }
}