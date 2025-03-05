package OOPS;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Summation of Two Numbers: " + c.add(1, 2));
        System.out.println("Summation of Three Numbers: " + c.add(1, 2, 3));
    }
}
