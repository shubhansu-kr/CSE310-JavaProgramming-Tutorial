class countAscend implements Runnable {
    public void run() {
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
    }
}

class countDescend implements Runnable {
    public void run() {
        int i = 21;
        for (int j = 0; j < 1000; j++) {
            System.out.print(i+j);
        }
    }
}

class Solution {
    public static void main(String[] args) {
        countAscend obj = new countAscend();
        countDescend obj1 = new countDescend();

        Thread th = new Thread(obj);
        Thread th1 = new Thread(obj1);

        th.start();
        th1.start();
    }
}