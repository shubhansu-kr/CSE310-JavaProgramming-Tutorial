// Cricket: 

import java.util.*;

class Match {
    int score;

    Match() {
        System.out.println("Match Default Constructor");
    }

    Match(int score) {
        this.score = score;
        System.out.println("Match Constructor");
    }

    void calculateScore() {
        int fours = 0, sixes = 0;

        // Local Nested class : Class inside the method.
        class Four {
            int count;
            {
                count = 0;
            }

            Four() {
                System.out.println("Four Default Constructor");
            }

            Four(int c) {
                this.count = c;
                System.out.println("Four Constructor");
            }

            void setCount(int x) {
                this.count += ((int)(Math.random()*100))%x + 1;
            }

            int getCount() {
                return count;
            }
        }

        // Local class cannot be accessed through main/Solution/outside funciton.
        class Six {
            int count;
            {
                count = 0;
            }

            Six() {
                System.out.println("Six Default Concstructor");
            }

            Six(int c) {
                this.count = c;
                System.out.println("Six Concstructor");
            }

            void setCount(int x) {
                this.count += ((int)(Math.random()*100))%x + 1;
            }

            int getCount() {
                return count;
            }

        }

        Four F1 = new Four(4);
        Six S1 = new Six(2);

        F1.setCount(18);
        S1.setCount(10);

        fours = F1.getCount();
        sixes = S1.getCount();

        this.score += fours * 4 + sixes * 6;
    }

    void displayScore() {
        System.out.println("Score : " + score);
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Match M1 = new Match(21);
        M1.calculateScore();
        M1.displayScore();
    }
}