class Solution {
    public static void main(String args[]) {
        Base b = new Base();
        Derived d = new Derived();

        // instanceof operator is used to find the class of object
        // here, d is the object of derived class, thus it is also
        // giving true as instance of base class. 

        System.out.println(b instanceof Base); // True
        System.out.println(b instanceof Derived); // False
        System.out.println(d instanceof Base); // True
        System.out.println(d instanceof Derived); // True
    }
}

class Base{}
class Derived extends Base {}