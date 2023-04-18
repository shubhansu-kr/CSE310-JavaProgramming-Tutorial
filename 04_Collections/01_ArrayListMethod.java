// ArrayList: Methods.

import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        ArrayList<String> models = new ArrayList<String>();

        models.add("Pavallion");

        ArrayList<String> macModels = new ArrayList<>();
        macModels.add("PRO");
        macModels.add("Air");

        // Add all the elements of one list to another.
        models.addAll(macModels);

        System.out.println(models);

        // Initialising list with other list, using constructor
        ArrayList<String> newList = new ArrayList<>(models);

        System.out.println(newList);

        // newList.get(i): Used to get the elements at index i
        // We cannot use newList[i];
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
        
        // newList.set(i, str); Used to update the value at index i with str
        for (int i = newList.size()-1; i > 0; i--) {
            newList.set(i, newList.get(i-1));
        }
        
        System.out.println(newList);

        // newList.retainAll(models): removes all the elements from newList 
        // which are not present in the models list.

        newList.retainAll(models);
        System.out.println(newList);   
        
        // get(): 
        // indexOf(): 

        // toArray(): Converts the arraylist elements into an array of object type.
        Object newArr[] = newList.toArray();
        
        System.out.println(Arrays.toString(newArr));
    }
}