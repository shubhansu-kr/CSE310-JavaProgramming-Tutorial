// Nested Class 

import java.util.*;

class Student {
    // Private Sub-Class
    private class Marks {
        // Inner Class : because it is nonstatic.

        // we dont need obj to call the non-static methods inside non-static class
        void show() {
            display(); // Outer class memeber fxn. 
        }

        void callDetails() {
            Student.Details obj = new Student.Details();
            obj.show();
        }
    }

    // Public Sub-Class : Static/Non-Static
    static public class Details {
        // static nested class. 
        void show() {
            System.out.println(name);
            Student s = new Student();

            s.display(); // calls outer member fxn.

            Student.Marks mk = s.new Marks();
            mk.show(); // call show fxn from Marks nested class.

            // If Marks subClass would have been static, we have a different 
            // syntax to create the object.
            // Student.Marks mk = new Student.Marks();
            
        }

        void callMarks() {
            Student s = new Student();
            Student.Marks mk = s.new Marks();

            mk.callDetails(); // calls Marks.callDetails which calls Details.show fxn.
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
        // Student.Marks mk = st.new Marks();
        
        
        obj.callMarks();
    }
}