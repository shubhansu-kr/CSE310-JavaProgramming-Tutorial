// FileOutputStream

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        File F = new File("dummy.txt");
        OutputStream os = null;

        try {
            // Checked exception: Need to handle FileNotFoundException
            os = new FileOutputStream(F);
            String address;
            address = sc.nextLine();

            // os.write(address);
            // We cannot pass string into this write function. It expects a byte[] var.
            // .getBytes() is used to convert string into bytes. 
            // getBytes() throws IOException exception which needs to be handled.
            os.write(address.getBytes());

            // close the string 
            // os.close();

        }catch(FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                os.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}