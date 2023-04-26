// Collection Sort

import java.util.*;

class Student implements Comparable<Student>{
    int roll;
    String name;

    Student(){}
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // implement comparator function in class 
    @Override
    public int compareTo(Student o) {
        if (this.roll > o.roll) {
            return 1;
        }
        else if (this.roll < o.roll) {
            return -1;
        }
        return 0;
    }
}


class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();

        al.add("555");
        al.add("255");
        al.add("5");

        Collections.sort(al);

        ArrayList<Student> std = new ArrayList<Student>();
        std.add(new Student(3, "shubh"));
        std.add(new Student(1, "Nitin"));
        std.add(new Student(8, "Mukher"));
        std.add(new Student(6, "Lakh"));

        // System.out.println(std);
        for (Student itrStudent : std) {
            System.out.print((itrStudent.name) + " ");
        }
        System.out.println();
        
        // Sorting on the basis of implemented 
        // Sort by roll
        Collections.sort(std);
        
        for (Student itrStudent : std) {
            System.out.print((itrStudent.name) + " ");
        }
        System.out.println();

        // std.sort(); : Need to pass the comparator
        // Collections.sort(std); : Error: Need to overwrite compareTo method
        // to make custom comparator.

        Comparator<Student> compareTo = (Student obj1, Student obj2)->{
            if (obj1.name.length() > obj2.name.length()) {
                return 1;
            }
            else if (obj1.name.length() < obj2.name.length()) {
                return -1;
            }
            return 0;
        };

        // Sort by length of name
        Collections.sort(std, compareTo);

        for (Student itrStudent : std) {
            System.out.print((itrStudent.name)+" ");
        }
        System.out.println();

        // System.out.println(std);
    }
}