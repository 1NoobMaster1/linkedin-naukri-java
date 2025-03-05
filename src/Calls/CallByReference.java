package Calls;

public class CallByReference {
    int n = 500;
    void change(CallByReference cbr) {
        n = n + 55;
    }
    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        System.out.println("Before Call: " + cbr.n);
        cbr.change(cbr);
        System.out.println("After Call: " + cbr.n);
    }
}
