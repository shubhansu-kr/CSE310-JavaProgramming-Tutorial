// Practice

import java.util.*;

class Solution {
    // 0 21 15 5
    // Constructor -> Static block.

    // The Objects of enums are static const by default. 
    // So, The objects are created even before static block and
    // do to this creation, the constructor is called before 
    // static block.
    enum myEnum{
        E1, E2(21), E3(15);

        // static block
        static {
            System.out.print(5 + " ");
        }

        myEnum(){System.out.print(0 + " ");}
        myEnum(int a){System.out.print(a + " ");}
        myEnum(int a, int b){System.out.print(a + b + " ");}
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        myEnum m1 = myEnum.E2;
    }
}

class Solution1 {

    enum myEnum{
        E1, E2(21), E3(15);

        // static block
        static {
            System.out.print(5 + " ");
        }

        myEnum(){System.out.print(0 + " ");}
        myEnum(int a){System.out.print(a + " ");}
        myEnum(int a, int b){System.out.print(a + b + " ");}
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // If we do not create instance, the static will not be called.
        // myEnum m1 = myEnum.E2;
    }
}