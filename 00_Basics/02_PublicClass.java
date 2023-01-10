import java.util.Scanner;

// If we use public keyword, file name and class name should be same
// So, We cannot use two public classes in one file.
public class Solution{
	public static void main(String a[]){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(num * num);
	}
}

class Problem {
	// public and static can be used interchangably.
	static public void main(String a[]){
		System.out.println("Hello World");
	}
}

class Solution1 {
	// Compiled succesfully
	// Runtime error while executing the .class file
	// error: main not found. 
}

class Solution2 {
	// Compiled successfully, 
	// Runtime error: main not found.
	static void main(String args[]) {
		System.out.println("Hello World!");
	}
}

// For multiple classes in one .java file, multiple .class executables are 
// created, one for each declared class. 

class Solution3 {
	// Dont specify return type
	// Compile time error : Invalid method declaration
	// return type required
	static public main(String a[]){
		System.out.println("Hello");
	}
}

class Solution4 {
	// Empty main function 
	// No error : Successfully compiled and executed.
	public static void main(String a[]){
		// Leave it empty 
	}
}

class Solution5 {
	// integer parameters 
	// Runtime error : Please use string args in main fxn. 
	public static void main(int a[]){
		System.out.println("Hello");
	}
}