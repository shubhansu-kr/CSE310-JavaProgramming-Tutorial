// fileInputStream: Read data from the File

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        File f = null;
        FileInputStream is = null;

        try {

            f = new File("dummy.txt");
            is = new FileInputStream(f);
            
            byte b[];

            b = is.readAllBytes();
            System.out.println(b.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}