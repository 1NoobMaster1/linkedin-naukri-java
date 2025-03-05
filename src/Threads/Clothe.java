package Threads;

public class Clothe extends Thread {
    public void run() {
        System.out.println("Thread is Running...");
    }
    public static void main(String[] args) {
        Clothe t = new Clothe();
        t.start();
    }
}
