package Factorial;

import java.util.Scanner;

public class FactorialByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n;
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return(n * factorial(n - 1));
        }
    }
}
