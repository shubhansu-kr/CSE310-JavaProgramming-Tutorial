// Enums in java

import java.util.*;

class Solution {

    // Create enum inside Solution class.
    public enum Week{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(Week wk: Week.values()) System.out.println(wk);
    }
}