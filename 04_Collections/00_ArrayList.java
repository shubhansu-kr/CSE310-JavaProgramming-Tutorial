// ArrayList

import java.util.*;

class Demo{

}
class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        // Raw initialisation of arraylist.
        ArrayList obj = new ArrayList();

        // obj.size(): returns the number of elements in array
        
        System.out.println(obj.size());
        // System.out.println();
        
        obj.add("shubh");
        obj.add("lakhan");
        obj.add(21);
        obj.add(15);
        obj.add(10);
        obj.add(new Demo());
        
        System.out.println(obj.size());

        // We can specify the initial capacity of the arraylist.
        ArrayList<Integer> v1 = new ArrayList<Integer>(5);
        System.out.println(v1.size());

        // v1.add(index, element)
        v1.add(4);

        System.out.println(v1.size());
    }
}