class Solution {
    public static void main(String args[]){
        
        X x1 = new Y();
        Y y1 = new Z();
        Y y2 = new Y();

        System.out.println(x1 instanceof X);
        System.out.println(x1 instanceof Z);
        System.out.println(y1 instanceof Z);
        System.out.println(y1 instanceof X);
    }
}

// System.out.print(2 > 1 || 4 > 2 ? false: true)
class X{}
class Y extends X{}
class Z extends Y{}

