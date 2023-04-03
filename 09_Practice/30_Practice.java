// Practice : Take command line argument 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int lower = 0, upper = 0;
        try {
            lower = Integer.parseInt(args[0]);
            upper = Integer.parseInt(args[1]);

            if (lower >= upper) {
                throw new Exception("Lower >= upper");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Know your limits");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Apple Oranges");
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Apple Oranges");
        } catch (Exception e) {
            System.out.println(e);
        } catch (Throwable e) {
            System.out.println(e);
        }

        for (int i = lower; i < upper; i++) {
            System.out.println(i);
        }
    }
}