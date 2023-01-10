class Examination {
    // With Object  || Without static method
    public static void main (String ...args) {
        System.out.println("Results: ");

        // Create Object 
        Examination E1 = new Examination();
        E1.cgpaOfStudent(args[0]);
    }

    void cgpaOfStudent(String cg) {
        System.out.println("Your CGPA is " + cg);
    }
}