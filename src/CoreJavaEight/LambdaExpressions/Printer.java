package CoreJavaEight.LambdaExpressions;

public class Printer {
    void print() {
        System.out.println("Printing with an Anonymous Object!");
    }
}

class AnonymousObject {
    public static void main(String[] args) {
        new Printer().print(); // Anonymous Object.
        // Anonymous Object: It has no name & It has no reference variable.
    }
}
