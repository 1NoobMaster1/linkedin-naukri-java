package CoreJavaEight.MoreInLambdaExpressions;

public interface A {
    void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("Show Method!");
    }
}

class Lambda {
    public static void main(String[] args) {
//        A obj;
//        obj = () -> {
//            System.out.println("Lambda Expressions!");
//        };
//        obj.show();

//        A obj = new A();
//        @Override
//        public void show() {
//            System.out.println("Lambda Expressions!");
//        }

        A obj = new B();
        obj.show();
    }
}
