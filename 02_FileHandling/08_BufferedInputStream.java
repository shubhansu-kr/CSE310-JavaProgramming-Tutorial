// fileInputStream: Read data from the File

import java.io.BufferedInputStream;
// import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        File f = null;
        FileInputStream is = null;
        BufferedInputStream br = null;

        try {

            f = new File("dummy.txt");
            is = new FileInputStream(f);

            br = new BufferedInputStream(is);

            
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
            System.out.println(br.available());
            br.mark(br.available());
            while((ch = br.read()) != -1) {
                System.out.print((char)ch);
                size++;
            }
            System.out.println("Break: " + size);
            
            // mark and reset not supported by jvm
            // Otherwise: Mark the input stream and go back to mark using reset fxn
            System.out.println("\n\n\n");

            br.reset();
            while((ch = br.read()) != -1) {
                System.out.print((char)ch);
                size++;
            }
                    
            // byte b[];
            // is.read(b, -is.available(), size)


            // System.out.println(is.getFD());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}