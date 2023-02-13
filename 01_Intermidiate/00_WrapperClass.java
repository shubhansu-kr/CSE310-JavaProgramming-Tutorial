class Solution {
	public static void main (String args[]){

        int size = args.length;

        for(int i = 0; i < size; ++i) {
            System.out.println(args[i]);
        }

        String s = "shubh";

        System.out.println(args[0].getClass().getSimpleName());

        // We have different static methods to parse the string into different datatype

        int x = Integer.parseInt(s);
        float f = Float.parseFloat(s);
        double d = Double.parseDouble(s);

        boolean b = Boolean.parseBoolean(s);
        long l = Long.parseLong(s);
        char c = s.charAt(0);

        char ca[] = {'s', 'i', 'i'};
        // but the parsing will only be successfull if the input and parsed type are type compatible.
        // eg. "hello" cannot be parsed into int type. 

        if (b) System.out.println(x + f + d + l);

        // to convert any data type to string we can use valueOf() method.

        String s1 = String.valueOf(x);
        String s2 = String.valueOf(f);
        String s3 = String.valueOf(d);
        String s4 = String.valueOf(l);
        String s5 = String.valueOf(c);
        String s6 = String.valueOf(ca);
        String s7 = String.valueOf(b);

        System.out.println(s1 + s2 + s3 + s4 + s5 + s6 + s7);
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
