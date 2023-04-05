// Create file

import java.util.*;
import java.io.File;
import java.io.IOException;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        File F = new File("dummy.txt");

        try {
            if(F.createNewFile()) {
                System.out.println("New File created");
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Input output Exception");
            System.out.println(e);
        }

        String absolutePath = "F:/Tutorials/03_Semester/Java/Sample.txt";
        F = new File(absolutePath);
        try {
            if (F.createNewFile()) {
                System.out.println(absolutePath + " file created");
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}