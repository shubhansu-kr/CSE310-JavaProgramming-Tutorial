// Collection extends Iterables

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        Iterator<Integer> it = nums.iterator();
        System.out.println(it.next());
        int i = 0;
        while(it.hasNext()){
            // System.out.println(it.next());
            System.out.println(i++);
            if (i > 10) break;
        }

        // it.next(): Prints the current element and moves the iterator to next
        // it.hasNext(): Checks if next element exitsts or not. Returns a boolean val.

        // it.forEachRemaining();
    }
}