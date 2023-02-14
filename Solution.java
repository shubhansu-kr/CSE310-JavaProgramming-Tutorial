// Singleton Class

import java.util.*;

class MySingleton {
    int a = 21;

    private static MySingleton ob;
    private MySingleton(){}

    public static MySingleton getInstance(){
        if (ob == null) {
            ob = new MySingleton();
        }
        return ob;
    }
}


class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        MySingleton ob = MySingleton.getInstance();
        System.out.println(ob.a);
    }
}