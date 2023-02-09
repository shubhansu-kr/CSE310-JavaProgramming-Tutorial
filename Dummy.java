class Solution {
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
