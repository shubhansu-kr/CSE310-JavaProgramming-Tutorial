class Solution {
    public static void main(String[] args) {

        Runnable obj = ()-> {
            char c = 'A';
            for (int i = 1; i <= 26; i++) {
                System.out.println(c);
                c += 1;
                try {
                Thread.sleep(1);
                }
                catch(InterruptedException ie) {
                    System.out.println("..");
                }
            }
        };

        Runnable obj1 = () -> {
            int i = 21;
            for (int j = 0; j < 1000; j++) {
                System.out.print(i+j);
            }
        };

        obj.run();
        obj1.run();
    }
}