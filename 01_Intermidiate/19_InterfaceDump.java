// Java program to show that interfaces can
// have methods from JDK 1.8 onwards


// import java.io.*;
// import java.lang.*;
// import java.util.*;


interface In1 {
    final int a = 10;

    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements In1 {
    // Driver Code
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}

// ---------------------------------------------------------

// Java Program to show that interfaces can
// have methods from JDK 1.8 onwards

interface In2 {
    final int a = 10;

    static void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass1 implements In2 {
    // Driver Code
    public static void main(String[] args) {
        In2.display();
    }
}

// ---------------------------------------------------------

interface A {
    void method1();

    void method2();
}

// B now includes method1 and method2
interface B extends A {
    void method3();
}

// the class must implement all method of A and B.
class Solution2 implements B {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }
}

// ----------------------------------------------------

interface Student {
    public void data();

}

class avi implements Student {
    public void data() {
        String name = "avinash";
        int rollno = 68;
        System.out.println(name);
        System.out.println(rollno);
    }
}

class Solution {
    public static void main(String args[]) {
        avi h = new avi();
        h.data();
    }
}

// ---------------------------------------------------

// implementation Level wise


// Level 1
interface Bank {
    void deposit();

    void withdraw();

    void loan();

    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit() {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {
        System.out.println("Loan from dev3");
    }

    public void account() {
        System.out.println("Account from dev3");
    }
}

// Level 4
class Solution1 {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}