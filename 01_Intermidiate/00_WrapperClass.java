class Solution {
	public static void main (String args[]){

        int size = args.length;

        for(int i = 0; i < size; ++i) {
            System.out.println(args[i]);
        }

        System.out.println(args[0].getClass().getSimpleName());

        // We have different static methods to parse the string into different datatype

        int x = Integer.parseInt(args[0]);
        float f = Float.parseFloat(args[0]);
        double d = Double.parseDouble(args[0]);

        // but the parsing will only be successfull if the input and parsed type are type compatible.
        // eg. "hello" cannot be parsed into int type. 

        System.out.println(x + f + d);
	}
}


// The CLI arguments passed are recieved in form of string.
class Solution1 {
	public static void main (String args[]){

        int size = args.length;

        for(int i = 0; i < size; ++i) {
            System.out.println(args[i]);
        }

        // For String. 
        System.out.println(args[0].getClass().getSimpleName());

        int intData = 21, x =15;
        // Error. 
        // System.out.println(x.getClass().getSimpleName());

        System.out.println((((Object)x).getClass().getSimpleName()));

        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());

	}
}

// The CLI arguments passed are recieved in form of string.
