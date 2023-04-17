// Generic Interface

import java.util.*;

interface Computer<T> {
    // modelId is a static variable, so we cannot create it with
    // generic data type.
    // T modelId;

    void setModelID(T modelID);
}

class Laptop<T> implements Computer<T> {
    T modelId;

    // Overwrite interface method.
    public void setModelID(T modelID) {
        this.modelId = modelID;
    }
}

interface bike<T extends Number> {
    void setModelID(T modelId);
}

// We need to match the generic signature of implemented class
// with interface class. 
// RR must have bounded generic

// Error: class RR<T> implements bike<T>{
    
class RR<T extends Number> implements bike<T>{
    T modelId;

    public void setModelID(T modelId){
        this.modelId = modelId;
    }
}

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        
    }
}