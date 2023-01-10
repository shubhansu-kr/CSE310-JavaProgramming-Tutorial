class Examination {
    // Without Object  || With static method
    public static void main (String ...args) {
        System.out.println("Results: ");
        cgpaOfStudent(args[0]);
    }
    // create a function : 
    // returnType functionName (Arguments) {}
    static void cgpaOfStudent(String cg) {
        System.out.println("Your CGPA is " + cg);
    }
}

class Examination {
    public static void main (String ...args) {
        System.out.println("Results: ");
        cgpaOfStudent(args[0]);
    }
    // Here if we do not use static method and call the method 
    // without object, we will get an error. 
    void cgpaOfStudent(String cg) {
        System.out.println(cg);
    }
}

class Examination {
    // With Object  || Without static method
    public static void main (String ...args) {
        System.out.println("Results: ");

        // Create Object 
        Examination E1 = new Examination();
        E1.cgpaOfStudent(args[0]);
    }

    void cgpaOfStudent(String cg) {
        System.out.println("Your CGPA is" + cg);
    }
}