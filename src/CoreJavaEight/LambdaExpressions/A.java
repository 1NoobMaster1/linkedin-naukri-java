package CoreJavaEight.LambdaExpressions;

public interface  A {
    void show(); // Unimplemented Method.
}

class B implements A {
    @Override
    public void show() {
        System.out.println("Show Method!");
    }
}

class Lambda {
    public static void main(String[] args) {
        // Anonymous Class: It has no name & it has only single object.
        // Anonymous Object: It has no reference variable.
        // A obj = new A(); // It cannot be Instantiated.
        A obj;
        obj = () -> {
            System.out.println("Lambda Expressions!");
        };
        obj.show();
    }
}
