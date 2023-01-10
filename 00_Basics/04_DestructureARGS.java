class Solution {
	// If we run the file using the command 
	// >> java filename.java args...

	// No bytecode is created in this case. Only the first 
	// class executed. 

	// The first main from top is executed. 
	public static void main (String... args) {
		System.out.println("Main: Solution");
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

class Solution1 {
	// Not executed if 
	public static void main (String... args) {
		System.out.println("Main: Solution1");
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}


