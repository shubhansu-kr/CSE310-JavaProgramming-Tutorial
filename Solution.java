class abc {
    void getstring(char c[]) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}

class Solution {

    public static void main(String[] args) {
        String uni = "LPU";
        uni = "Lovely Professional University";
        System.out.println(uni);
        char ch[] = { 'F', 'A', 'R', 'A', 'N' };
        abc s = new abc();
        s.getstring(ch);
    }
}