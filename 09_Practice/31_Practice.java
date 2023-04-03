// Take name input : Store only first name : Display first name

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        try {
            String name = sc.nextLine();

            int index = name.indexOf(' ');
            String firstName = name.substring(0, index);

            System.out.println(firstName);

        } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
            if (e instanceof StringIndexOutOfBoundsException) {
                System.out.println("Provide your full name");
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Missed exception");
        }

    }
}