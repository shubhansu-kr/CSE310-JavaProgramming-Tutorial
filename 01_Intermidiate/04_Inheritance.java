class Parent {
    Parent() {
        System.out.println("Constructor Parent 0");
    }

    Parent(int a) {
        this(21, 15);
        System.out.println("Constructor Parent 1");
    }

    Parent(int a, int b) {
        this();
        System.out.println("Constructor Parent 2");

    }
}

class Child extends Parent {
    Child() {
        super(21);
        System.out.println("Child Constructor 1");
    }

    Child(int a) {
        this();
        System.out.println("Child Constructor 2");
    }
}

class Solution {
    public static void main(String args[]){
        Child Obj = new Child(21);
        
    }
}