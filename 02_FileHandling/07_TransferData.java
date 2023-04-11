// Transfer data from one file to another

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        File f1, f2;
        FileInputStream is;
        FileOutputStream os;

        try {
            f1 = new File("dummy.txt");
            f2 = new File("Sample.txt");

            is = new FileInputStream(f1);
            os = new FileOutputStream(f2);

            os.write(is.readAllBytes());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}