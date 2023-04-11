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

            
            // is.read(bytes b[]): Reads up to b.length bytes of data from this input stream
            // into an array of bytes. This method blocks until some input is available

            // is.read(); Reads one byte from the file
            // returns -1 for eof.
            // System.out.println(is.read()); // Ascii code of first char

            // We can read the whole file using loop
            // Everytime we read the file, the pointer is shifted by one bite
            // so after every read call we can read new data.
            int ch = 1, size = 0;

            // Used to check the remaining portion of file to be read.
            System.out.println(is.available());
            // is.mark(is.available());
            while((ch = is.read()) != -1) {
                System.out.print((char)ch);
                size++;
            }
            System.out.println("Break: " + size);
            
            // mark and reset not supported by jvm
            // Otherwise: Mark the input stream and go back to mark using reset fxn

            // is.reset();
            // while((ch = is.read()) != -1) {
            //     System.out.print((char)ch);
            //     size++;
            // }
            
            
            // byte b[];
            // is.read(b, -is.available(), size)

            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}