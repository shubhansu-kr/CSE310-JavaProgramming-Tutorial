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

            // We cannot access the non static member of outer class inside the static sub class.
            // System.out.println(counter);
        }

        void callMarks() {
            Student s = new Student();
            Student.Marks mk = s.new Marks();

            mk.callDetails(); // calls Marks.callDetails which calls Details.show fxn.
        }
    }

    public class Result {
        char grade;
        float CGPA;

        {
            grade = 'N';
            CGPA = 0.0f;
        }

        Result() {}
        Result(char C, float f) {
            grade = C;
            f = CGPA;
        }

        void setGrade(char c) {
            grade = c;
        }

        void setCG(float f) {
            CGPA = f;
        }

        void showResult() {
            System.out.println("Grade : " + grade);
            System.out.println("CGPA  : " + CGPA);
        }

        static void callMarksAndCallDetails() {
            Student st = new Student();

            Student.Marks mk = st.new Marks();

            // Since Details is a static class we need to create the object using 
            // this syntax only.
            Student.Details dk = new Student.Details();

            mk.show();
            dk.show();
        }
    }


    static String name = "Shubh";
    int counter = 21;
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

        // or we can create using a different syntax 
        Student.Result obj1 = st.new Result();
        obj1.setCG(5.3f);
        obj1.setGrade('C');
        obj1.showResult();

        // Private not available. 
        // Student.Marks obj1 = new Student.Marks();
        // Student.Marks mk = st.new Marks();
        
        
        obj.callMarks();
    }
}