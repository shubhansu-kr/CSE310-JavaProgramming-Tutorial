import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    static int[] createArray(){

        int temp[] = new int[0];        

        int size;
        System.out.print("\nEnter the Size Of Array: ");
        size = sc.nextInt();

        if (size < 0) {
            System.out.println("Invalid Size");
            return temp;
        }
        
        temp = new int[size];

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        
        if (n > size){
            System.out.println("Invalid Number of element");
            return temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print("Enter element: ");
            temp[i] = sc.nextInt();
        }

        return temp;
    }

    static void insertElement(int temp[]) {
        int size = temp.length;

        System.out.print("\nEnter the index to insert element: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        for(int i = size-1; i > index; --i) {
            temp[i] = temp[i-1];
        }
        temp[index] = element;

        return;
    }

    public static void main(String args[]){

        int temp[] = createArray();

        for(int it: temp){System.out.print(it + " ");}
        System.out.println();

        insertElement(temp);

        for(int it: temp){System.out.print(it + " ");}
        System.out.println();
    }
}