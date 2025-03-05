package OOPS;

interface A {
    default void UI() {
        System.out.println("UI");
    }
}

interface B {
    default void UX() {
        System.out.println("UX");
    }
}

class Join implements A, B {
    @Override
    public void UI() {
        A.super.UI();
        B.super.UX();
    }
    public static void main(String[] args) {
        Join j = new Join();
        j.UI();
    }
}
