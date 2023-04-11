// Read the second line from the file

import java.io.FileInputStream;
import java.io.File;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        File f = null;
        FileInputStream is = null;

        try {
            f = new File("dummy.txt");
            is = new FileInputStream(f);

            int ch, flag = 0;
            while((ch = is.read()) != -1) {
                if (flag == 1) {
                    System.out.print((char)ch);
                    if ((char)ch == '\n') {
                        flag = 0;
                        break;
                    }
                }

                if ((char)ch == '\n') {
                    flag ^= 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}