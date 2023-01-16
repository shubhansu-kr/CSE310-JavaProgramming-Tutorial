// WAP to create a class examination having a method display
// taking three argument. 

class Examination {
    void display(String name, String regNo, String section) {
        System.out.println(name + " " + regNo + " " + section);
    }
    
    public static void main(String args[]) {
        Examination E1 = new Examination();
        E1.display(args[0], args[1], args[2]);
    }
}