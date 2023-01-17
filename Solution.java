class Solution {
    public static void main(String args[]) {
        Base b = new Base();
        Derived d = new Derived();

        System.out.println(b instanceof Base); // True
        System.out.println(b instanceof Derived); // False
        System.out.println(d instanceof Base); // True
        System.out.println(d instanceof Derived); // True
    }
}

class Base{}
class Derived extends Base {}