// String Builder 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // ByDefault 16 bytes capacity is reserved initially. 

        StringBuilder sb1 = new StringBuilder("Java"); // Initialises the Builder with java string. 
        System.out.println();
        System.out.println(sb1.length()); // 4
        System.out.println(sb1.capacity()); // 20 : Default(16) + 4(length of string)

        // Now capacity is 20 and len is 4 so we have 16 bytes to append char
        // If we cross this 16 byte limit. we will have to reallocate memory 
        // newCapacity = (oldCapacity + 1) * 2 ;
        sb1.append("stringofLengthgreaterthanf16.");

        System.out.println();
        System.out.println(sb1.length()); // 33 length of string. 
        System.out.println(sb1.capacity()); // 42 capacity : (20 + 1) * 2;

        // Let's say we add string which has length greater than newly alloted mem, from formula, 
        // we will get capacity equal to the length of the new string. 
        // ie overflow bytes will be added. 
        sb1.append("..........................................................................");
        System.out.println();
        System.out.println(sb1.length()); // 107
        System.out.println(sb1.capacity()); // 107  (Capacity same as length)

        StringBuilder s2 = new StringBuilder(20); // capacity 
        System.out.println();
        System.out.println(s2.capacity()); // 20

        // We can also use ensureCapacity(n) to set the capacity of the builder
        s2.ensureCapacity(40);
        System.out.println();
        System.out.println(s2.capacity()); // 42 : max(40, (20+1)*2)

        // When we try to increase the capacity of the StringBuilder, the compiler
        // calculates the new capacity using the formula and compares it with the passed 
        // capacity and whichever is maximum is used. 
        // eg. oldCapacity 20; 
        // sb.ensureCapacity(40);
        // now the new capcaity according to formula is 42 and passed capacity is 40. so max(42, 40) is
        // chosen, which in this case is 42.
        // now again, let's say the sb.ensureCapacity(100) is called. Now formula gives 86 and passed is 100
        // so new capacity of sb is 100.

        s2.ensureCapacity(100);
        System.out.println();
        System.out.println(s2.capacity()); // 100 = max(100, (42+1)*2);

        // s.delete()
        System.out.println();
        System.out.println(sb1.length());   // 107
        System.out.println(sb1.capacity()); // 107

        // s.delete(start, end) : Delete the string from start index to end-1 index.
        sb1.delete(10, 50);

        System.out.println();
        System.out.println(sb1.length());   // 67
        System.out.println(sb1.capacity()); // 107

        // Delete function reduces the length of the string. But the capacity remains the same.
        
    }
}