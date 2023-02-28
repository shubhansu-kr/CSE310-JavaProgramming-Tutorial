interface Student {
    public void data();

}

class avi implements Student {
    public void data() {
        String name = "avinash";
        int rollno = 68;
        System.out.println(name);
        System.out.println(rollno);
    }
}

class Solution {
    public static void main(String args[]) {
        avi h = new avi();
        h.data();
    }
}