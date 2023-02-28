// Interface in Java

interface Computer {

}

class Desktop implements Computer {
    void developing() {
    }
}

class Laptop implements Computer {
    void developing() {
    }
}

class Developer {
    void devCode(Computer l) {
        System.out.println("Coding..");
    }
}

class Solution {
    public static void main(String[] args) {
        // Computer lp = new Laptop();
        Computer dp = new Desktop();
        Developer d = new Developer();
        d.devCode(dp);

    }
}