// Nested Catch

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int a = 1, b = 1 , c= 1;
        try {
            try{
                a = sc.nextInt();
                b = sc.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Inside catch 0");
            }
            
            c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch 1");
            
            try {
                b = sc.nextInt();
                c = a/b;
            }
            catch (ArithmeticException e1) {
                System.out.println(e1);
                System.out.println("Again input is 0");
                System.out.println("Assigning 1");
                b = 1;
                c = a/b;
            }
            catch(InputMismatchException e1) {
                System.out.println("Invalid Input format: Enter integer");
            }
            catch(Exception e1) {
                System.out.println(e1);
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid Input format: Enter integer");
        }
        catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(c);
        System.out.println("L");
    }
}