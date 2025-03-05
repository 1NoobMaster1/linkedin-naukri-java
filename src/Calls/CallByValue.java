package Calls;

public class CallByValue {
    int n = 500;
    void change(int n) {
        n = n + 55;
    }
    public static void main(String[] args) {
        CallByValue cbv = new CallByValue();
        System.out.println("Before Call: " + cbv.n);
        cbv.change(cbv.n);
        System.out.println("After Call: " + cbv.n);
    }
}
