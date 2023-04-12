// Practice

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

class Members{
    String name;
    int age;

    Members(){}
    Members(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }
}
class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        String name;
        int age;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        File f = new File(name);
        f.mkdir();

        String destFolder = "./";
        destFolder += name;

        String eligibleFileName = destFolder + "/eligible.txt";
        String notEligibleFileName = destFolder + "/notEligible.txt";

        File f1 = new File(eligibleFileName);
        File f2 = new File(notEligibleFileName);

        try {
            f1.createNewFile();
            System.out.println(eligibleFileName + " file created");
            f2.createNewFile();
            System.out.println(notEligibleFileName + " file created");

        } catch (Exception e) {
            System.out.println("1");
            System.out.println(e);
        }

        int n;
        System.out.print("How many Members are there in your fam: ");
        n = sc.nextInt();
        
        Members M[] = new Members[n];
        
        M[0] = new Members(name, age);
        
        for (int i = 1; i < n; i++) {

            System.out.println();

            sc.nextLine();
            System.out.print("Enter member " + i + " name: ");
            name = sc.nextLine();
            System.out.print("Enter member " + i + " age: ");
            age = sc.nextInt();

            M[i] = new Members(name, age);
        }

        FileOutputStream os1 = null; 
        FileOutputStream os2 = null; 
        
        try {
            os1 = new FileOutputStream(f1); 
            os2 = new FileOutputStream(f2); 

            for (int i = 0; i < n; i++) {
                if (M[i].getAge() < 18) {
                    os1.write((M[i].getName()+"\n").getBytes());
                }
                else {
                    os2.write((M[i].getName()+"\n").getBytes());
                }
            }
        } catch (Exception e) {
            System.out.println("2");
            System.out.println(e);
        }
        finally {

            try {
                os1.close();
                os2.close();
            } catch (Exception e) {
                System.out.println("3");
            }
        }

        System.out.println("Done");

    }
}