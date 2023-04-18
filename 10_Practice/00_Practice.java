// Take 10 inputs 

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    static boolean isValid(String str) {
        boolean firstChar = false;
        boolean specialChar = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if (i == 0) {firstChar = true;}
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){}
            else {specialChar = true;}
        }

        return (firstChar && !specialChar);
    }

    public static void main(String args[]){
        String Name[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            Name[i] = sc.nextLine();
        }

        ArrayList<String> validNames = new ArrayList<String>();
        
        for (int i = 0; i < 10; i++) {
            if (isValid(Name[i])){
                validNames.add("Hi! " + Name[i]);
            }
        }

        System.out.println(validNames);
    }
}