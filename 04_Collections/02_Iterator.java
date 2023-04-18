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

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}