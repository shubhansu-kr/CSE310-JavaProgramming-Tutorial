class Solution {
	public static void main (String args[]){
		System.out.println(args[0]);
		System.out.println(args[1]);

        System.out.println((Object(args[0])).getClass().getSimpleName());
	}
}

// The CLI arguments passed are recieved in form of string.
