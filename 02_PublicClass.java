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
	public static void main(String a[]){
		System.out.println("Hello World");
	}
}