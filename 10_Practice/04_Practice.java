// Use ListIterator Method to replace every occurence of 0 with 1
// Also Enclose every group of 10 with 20.

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(nums);

        ListIterator<Integer> it = nums.listIterator();

        while(it.hasNext()) {
            int x = it.next();

            if (x == 10) {
                it.previous();
                it.add(20);
                while(it.hasNext() && it.next() == 10);
                it.add(20);
            }
            else if (x == 0) {
                it.set(1);
            }
        }

        System.out.println(nums);
    }
}