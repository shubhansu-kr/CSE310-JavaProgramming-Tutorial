class Solution {

    // Constant variable : Use keyword 'final';
    // const variable must be initialised. 

    final int i = 21;
    final int j = 15;

    // int final j = 15; : We cannot interchange data type and integer.
    // final int k; : throw error since we are not initialising a const var.

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        System.out.println(new Solution().i);
        System.out.println(new Solution().j);
    }
}