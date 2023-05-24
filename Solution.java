class Parent {
    public void drive() {
        System.out.print("“Parent”");
    }

    public int drive(int a) {
        System.out.print("“Parent with Int”");
        return 0;
    }
}

class Child extends Parent {
    public int drive() {
        System.out.print("“Child”");
        return 0;
    }

    public static void main(String[] rk) {
        Parent p = new Parent();
        p.drive();
    }
}