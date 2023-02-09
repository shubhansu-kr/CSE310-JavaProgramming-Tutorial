class Solution {
	public static void main (String args[]){
		System.out.println(args[0]);
		System.out.println(args[1]);

        // For String. 
        System.out.println(args[0].getClass().getSimpleName());

        int x = 21;
        // Error. 
        // System.out.println(x.getClass().getSimpleName());

        System.out.println(((Object)x.getClass().getSimpleName()));
	}
}

// The CLI arguments passed are recieved in form of string.
