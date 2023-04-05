// File Class Methods in Java

import java.io.File;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        // boolean isFile();
        // boolean isDirectory();
        // boolean exists();
        // boolean isHidden();
        // boolean canRead();
        // boolean canWrite();
        // String getPath();
        // String getAbsolutePath();
        // long lastModified();
        // long length();

        File F0 = new File("Sample.txt");
        File F1 = new File("Sample");

        System.out.println(F0.isFile()); // T
        System.out.println(F1.isFile()); // F
        
        System.out.println(F0.isDirectory()); // F
        System.out.println(F1.isDirectory()); // T

        System.out.println(F0.exists()); // T
        System.out.println(F1.exists()); // T

        System.out.println(F0.canRead()); // T
        System.out.println(F1.canRead()); // T
        
        System.out.println(F1.canWrite()); // T
        System.out.println(F1.canWrite()); // T

        System.out.println(F0.getName()); 
        System.out.println(F1.getName()); 
        
        System.out.println(F0.getPath());
        System.out.println(F1.getPath());

        System.out.println(F0.getAbsolutePath());
        System.out.println(F1.getAbsolutePath());

        System.out.println(F0.lastModified());
        System.out.println(F1.lastModified());

        System.out.println(F0.length());
        System.out.println(F1.length());
        
    }
}