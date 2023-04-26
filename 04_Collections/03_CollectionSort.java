// Collection Sort

import java.util.*;

class Student {
    int roll;
    String name;

    Student(){}
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
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
        std.add(new Student(0, "shubh"));
        std.add(new Student(1, "Nitin"));
        std.add(new Student(3, "Mukher"));
        std.add(new Student(4, "Lakh"));

        System.out.println(std);

        // std.sort(); : Need to pass the comparator
        // Collections.sort(std); : Error: Need to overwrite compareTo method
        // to make custom comparator.

        Comparator<Student> compareTo = (Student obj1, Student obj2)->{
            if (obj1.name.charAt(0) > obj2.name.charAt(0)) {
                return 1;
            }
            return 0;
        };

        Collections.sort(std, compareTo);

        System.out.println(std);
    }
}