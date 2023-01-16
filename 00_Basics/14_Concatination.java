import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // The exp are evaluated from left to right in java
        // String + int = string: year + 2022 = year 2022 
        // again,
        // year 2022 + 1 = year 20221
        System.out.println("Year " + 2022 + 1);  // output: year 20221

        // int + int + string = int + string = string
        // 2022 + 1 + " year"= 2023 + " year" = "2023 year"
        System.out.println(2022 + 1 + " Year");  // output: 2023 year

        // In java char is a subset of integer 
        // char + char + string = int + int + string = int + string = string
        // 'A' + 'A' + " year" = 130 + 130 + " year" = 130 + "year" = "130 year"
        System.out.println('A' + 'A' + " year"); // output: 130 year
    
        // Error: We cannot add int and boolean.
        // System.out.println(10 + false + " year");
        
        System.out.println(10 + 10.1 + " year");
    }
}