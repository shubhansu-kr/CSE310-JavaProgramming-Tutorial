// Create File Using Java

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

class Laptop {
    public String brand, model, warranty;

    Laptop() {
    }

    Laptop(String a, String b, String c) {
        brand = a;
        model = b;
        warranty = c;
    }

    String getDetailsString() {
        String res = "";
        res += "Laptop Brand is: ";
        res += brand;
        res += "\n";

        res += "Model is: ";
        res += model;
        res += "\n";

        res += "Warranty Period is: ";
        res += warranty;
        res += "\n";

        return res;
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Laptop lp = new Laptop();

        lp.brand = sc.nextLine();
        lp.model = sc.nextLine();
        lp.warranty = sc.nextLine();

        File f = null;
        FileOutputStream os = null;

        try {

            f = new File("dummy.txt");

            // True is used to create stream in append mode.
            os = new FileOutputStream(f, true);

            // We do not need to concatinate the strings to form stream.
            // os.write(lp.getDetailsString().getBytes());
            
            // We can use miltiple writes method. 
            // Does not add breakline on its own. 
            os.write(lp.brand.getBytes());
            os.write(lp.model.getBytes());
            os.write(lp.warranty.getBytes());

            // Result: HPpavallion2 in dummy.txt

            // Type conversion
            // byte b[] = lp.model.getBytes();
            // String res = b.toString();

            os.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                os.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}